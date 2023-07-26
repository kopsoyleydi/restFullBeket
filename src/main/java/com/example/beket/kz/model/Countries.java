package com.example.beket.kz.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries extends BaseModel{
	private String name;
	private String shortName;

}
