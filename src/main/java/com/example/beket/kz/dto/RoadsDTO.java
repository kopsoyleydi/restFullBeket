package com.example.beket.kz.dto;




import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RoadsDTO {

	private Long id;
	@ManyToOne
	private CityDTO departure;

	@ManyToOne
	private CityDTO arrival;

	private String departure_time;

	private String arrival_time;

	private String departure_date;

	private String arrival_date;

	@ManyToOne
	private BusDTO bus_id;
}