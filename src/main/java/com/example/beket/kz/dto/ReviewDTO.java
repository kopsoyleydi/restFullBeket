package com.example.beket.kz.dto;


import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ReviewDTO {

	private Long id;
	private String comment;
	@ManyToOne
	private MainUserDTO user;

	@ManyToOne
	private RoadsDTO stationId;
}