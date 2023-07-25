package com.example.beket.kz.api;

import com.example.beket.kz.dto.CityDTO;
import com.example.beket.kz.dto.StationDTO;
import com.example.beket.kz.service.CityService;
import com.example.beket.kz.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/basic")
public class WithoutAuthRest {

	private final CityService cityService;

	private final StationService stationService;

	@GetMapping(value = "/getAllCities")
	public List<CityDTO> getAllCities(){
		return cityService.getAllCities();
	}

	@GetMapping(value = "/getAllStations")
	public List<StationDTO> getAllStations(){
		return stationService.getAllStations();
	}

	@GetMapping(value = "/getStationsByCityId")
	public List<StationDTO> getStationsByCityId(@RequestParam Long cityId){
		return stationService.getStationsByCityId(cityId);
	}
}
