package com.example.beket.kz.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "cities")
@Getter
@Setter
public class ListOfCities extends BaseModel{

	@Column(name = "name")
	private String name;

	@Column(name = "shortName")
	private String shortName;

	@ManyToMany
	private List<ListOfStation> stations;

}