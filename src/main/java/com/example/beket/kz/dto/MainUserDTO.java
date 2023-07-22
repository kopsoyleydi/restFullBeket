package com.example.beket.kz.dto;



import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
public class MainUserDTO {

	private Long id;

	private String email;

	private String password;

	private String name;

	private String surname;

	private String citizenship;

	private String numberOfDocument;

	private String phoneNumber;
	@ManyToMany
	private List<PermissionDTO> permissions;
}