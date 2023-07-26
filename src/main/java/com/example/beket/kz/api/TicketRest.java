package com.example.beket.kz.api;


import com.example.beket.kz.dto.BookingPlaceDTO;
import com.example.beket.kz.dto.TicketDTO;
import com.example.beket.kz.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/ticket")
public class TicketRest {

	private final TicketService ticketService;

	@PostMapping(value = "/receive")
	public TicketDTO receiveTicket(@RequestBody BookingPlaceDTO bookingPlaceDTO){
		return ticketService.addNewTicket(bookingPlaceDTO);
	}
}
