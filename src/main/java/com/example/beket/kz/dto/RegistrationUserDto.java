package com.example.beket.kz.dto;


import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationUserDto {

	private String email;

	private String password;

	private String confirmPassword;

	private String name;

	private String surname;
	private String patronymic;

	@ManyToOne
	private CountryDTO citizenship;
	private String numberOfDocument;

	private String phoneNumber;
}
