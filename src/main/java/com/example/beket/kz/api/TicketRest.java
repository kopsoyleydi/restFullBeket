package com.example.beket.kz.api;


import com.example.beket.kz.dto.BookingPlaceDTO;
import com.example.beket.kz.dto.JwtResponse;
import com.example.beket.kz.dto.TicketDTO;
import com.example.beket.kz.dto.TokenDTO;
import com.example.beket.kz.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/ticket")
public class TicketRest {

	private final TicketService ticketService;

	@PostMapping(value = "/receive")
	public TicketDTO receiveTicket(@RequestBody BookingPlaceDTO bookingPlaceDTO){
		return ticketService.addNewTicket(bookingPlaceDTO);
	}

	@GetMapping(value = "/getTicketsByUserId")
	public List<TicketDTO> getTicketsByUserId(@RequestBody TokenDTO tokenDTO){
		return ticketService.getTicketsByUserId(tokenDTO);
	}
}
