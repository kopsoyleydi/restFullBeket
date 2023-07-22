package com.example.beket.kz.dto;


import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CityDTO {
	private Long id;
	private String name;
	private String shortName;
	@ManyToOne
	private StationDTO stationId;
}