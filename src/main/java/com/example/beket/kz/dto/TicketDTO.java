package com.example.beket.kz.dto;





import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TicketDTO {
	private Long id;
	@ManyToOne
	private MainUserDTO user;

	private Long primeCodeTicket;

	@ManyToOne
	private RoadsDTO roadId;

	private int place;
}