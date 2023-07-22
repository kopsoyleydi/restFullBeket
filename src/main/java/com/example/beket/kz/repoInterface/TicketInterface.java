package com.example.beket.kz.repoInterface;

import com.example.beket.kz.model.Ticket;

import java.util.List;

public interface TicketInterface {

	Ticket getTicketById(Long id);

	Ticket createTicket(Ticket ticket);

	List<Ticket> getAllTickets();

	List<Ticket> getTicketByUserId(Long id);



}
