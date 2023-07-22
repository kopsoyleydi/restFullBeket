package com.example.beket.kz.mapper;



import com.example.beket.kz.dto.TicketDTO;
import com.example.beket.kz.model.Ticket;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TicketMapper {

	TicketDTO toDto(Ticket tickets);

	Ticket toModel(TicketDTO ticketDTO);

	List<TicketDTO> toDtoList(List<Ticket> list);

	List<Ticket> toTicketList(List<TicketDTO> list);
}