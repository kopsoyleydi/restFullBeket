package com.example.beket.kz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stations")
@Getter
@Setter
public class ListOfStation extends BaseModel{

	@Column(name = "station_name")
	private String stationName;

	@Column(name = "address")
	private String address;

	@Column(name = "contact")
	private String contact;

}
