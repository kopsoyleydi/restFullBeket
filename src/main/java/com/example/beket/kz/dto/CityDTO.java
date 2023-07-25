package com.example.beket.kz.dto;


import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class CityDTO {
	private Long id;
	private String name;
	private String shortName;
	@ManyToMany
	private List<StationDTO> stations;
}