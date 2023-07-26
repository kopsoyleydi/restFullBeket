package com.example.beket.kz.dto;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingPlaceDTO {

	private String token;

	@ManyToOne
	private RoadsDTO roadId;

	private int place;

	private String dateOfBirth;

	private String name;

	private String surname;

	private String patronymic;

	@ManyToOne
	private CountryDTO citizenship;

	@ManyToOne
	private DocumentTypeDTO documentType;

	private String numberOfDocument;

}
