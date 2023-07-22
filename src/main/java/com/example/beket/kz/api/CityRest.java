package com.example.beket.kz.api;

import com.example.beket.kz.dto.CityDTO;
import com.example.beket.kz.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class CityRest {
	private final CityService cityService;

	@GetMapping(value = "/getAllCities")
	public List<CityDTO> getAllCities(){
		return cityService.getAllCities();
	}
}
