package com.example.beket.kz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roads")
@Getter
@Setter
public class ListOfRoads extends BaseModel {

	@ManyToOne
	private ListOfCities departure;

	@ManyToOne
	private ListOfCities arrival;

	@Column(name = "departure_time")
	private String departure_time;

	@Column(name = "arrival_time")
	private String arrival_time;

	@Column(name = "departure_date")
	private String departure_date;

	@Column(name = "arrival_date")
	private String arrival_date;

	@Column(name = "price")
	private int price;

	@ManyToOne
	private ListOfBus bus_id;

}
