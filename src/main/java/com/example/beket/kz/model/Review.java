package com.example.beket.kz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "comment")
@Getter
@Setter
public class Review extends BaseModel {

	private String comment;

	@ManyToOne
	private User user;

	@ManyToOne
	private ListOfStation stationId;
}
