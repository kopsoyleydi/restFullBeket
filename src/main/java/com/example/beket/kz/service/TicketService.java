package com.example.beket.kz.service;

import com.example.beket.kz.EmailTicketSender;
import com.example.beket.kz.dto.BookingPlaceDTO;
import com.example.beket.kz.dto.TicketDTO;
import com.example.beket.kz.mapper.*;
import com.example.beket.kz.model.ListOfRoads;
import com.example.beket.kz.model.Ticket;
import com.example.beket.kz.model.User;
import com.example.beket.kz.repoImpl.RoadImpl;
import com.example.beket.kz.repoImpl.TicketImpl;
import com.example.beket.kz.repoImpl.UserImpl;
import com.example.beket.kz.utils.JwtTokenUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketService {

	private final TicketImpl ticketImpl;
	private final UserService userService;
	private final EmailTicketSender emailTicketSender;

	private final TicketMapper ticketMapper;

	private final TicketNumberGenerator generator;

	private final RoadImpl roadImpl;

	private final UserImpl userImpl;

	private final DocumentTypeMapper documentTypeMapper;

	private final CountryMapper countryMapper;

	private final JwtTokenUtils jwtTokenUtils;

	public TicketDTO addNewTicket(BookingPlaceDTO bookingPlaceDTO){
		User user = (User) userService.loadUserByUsername(jwtTokenUtils.extractUsername(bookingPlaceDTO.getToken()));
		Ticket ticket = new Ticket();
		if(user != null){
			user.setName(bookingPlaceDTO.getName());
			user.setSurname(bookingPlaceDTO.getSurname());
			user.setPatronymic(bookingPlaceDTO.getPatronymic());
			user.setDocumentType(documentTypeMapper.toModel(bookingPlaceDTO.getDocumentType()));
			user.setNumberOfDocument(bookingPlaceDTO.getNumberOfDocument());
			user.setCitizenship(countryMapper.toModel(bookingPlaceDTO.getCitizenship()));
			user.setDateOfBirth(bookingPlaceDTO.getDateOfBirth());
			ListOfRoads roads = roadImpl.getRoadById(bookingPlaceDTO.getRoadId().getId());
			ticket.setRoadId(roads);
			ticket.setPlace(bookingPlaceDTO.getPlace());
			ticket.setUser(user);
			ticket.setPrimeCodeTicket((long) generator.generateTicketNumber());
			userImpl.updateParam(user);
			emailTicketSender.sendEmail(user.getEmail(), "Your ticket",ticket);
			return ticketMapper.toDto(ticketImpl.createTicket(ticket));
		}
		return null;
	}

}
