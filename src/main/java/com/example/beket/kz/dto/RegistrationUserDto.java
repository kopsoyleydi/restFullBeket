package com.example.beket.kz.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationUserDto {

	private String email;

	private String password;

	private String confirmPassword;

	private String phoneNumber;
}
