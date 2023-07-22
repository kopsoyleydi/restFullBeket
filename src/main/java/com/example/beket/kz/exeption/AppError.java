package com.example.beket.kz.exeption;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class AppError {
	private int status;
	private String message;
	private Date timestamp;

	public AppError(int status, String message) {
		this.status = status;
		this.message = message;
		this.timestamp = new Date();
	}
}