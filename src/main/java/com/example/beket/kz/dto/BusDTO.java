package com.example.beket.kz.dto;



import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class BusDTO {

	private Long id;
	@ManyToOne
	private StationDTO stationId;

	private int places;

	private String govNumber;
}