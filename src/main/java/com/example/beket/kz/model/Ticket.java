package com.example.beket.kz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tickets")
@Getter
@Setter
public class Ticket extends BaseModel {

	@ManyToOne
	private User user;

	@Column(name = "prime_code_ticket")
	private Long primeCodeTicket;

	@ManyToOne
	private ListOfRoads roadId;

	private int place;
}