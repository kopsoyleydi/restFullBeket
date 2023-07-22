package com.example.beket.kz.dto;



import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SaveUserDto {

	private String email;

	private String name;

	private String password;

	private String citizenship;

	private String numberOfDocument;

	private String phoneNumber;

	@ManyToMany
	private List<PermissionDTO> permissions;
}
