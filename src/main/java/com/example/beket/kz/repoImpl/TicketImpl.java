package com.example.beket.kz.repoImpl;

import com.example.beket.kz.model.ListOfRoads;
import com.example.beket.kz.model.Ticket;
import com.example.beket.kz.repoInterface.TicketInterface;
import com.example.beket.kz.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketImpl implements TicketInterface {

	private final TicketRepository ticketRepository;

	@Override
	public Ticket getTicketById(Long id) {
		return ticketRepository.findAllById(id);
	}

	@Override
	public Ticket createTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> getAllTickets() {
		return ticketRepository.findAll();
	}

	@Override
	public List<Ticket> getTicketByUserId(Long id) {
		return ticketRepository.findAllByUserId(id);
	}

	public List<Ticket> getTicketByRoadId(ListOfRoads roads){
		return ticketRepository.findAllByRoadId(roads);
	}
}
