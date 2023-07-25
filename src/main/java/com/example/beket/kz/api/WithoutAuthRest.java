package com.example.beket.kz.api;

import com.example.beket.kz.dto.BusDTO;
import com.example.beket.kz.dto.CityDTO;
import com.example.beket.kz.dto.StationDTO;
import com.example.beket.kz.service.BusService;
import com.example.beket.kz.service.CityService;
import com.example.beket.kz.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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

	private final BusService busService;

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

	@GetMapping(value = "/getBusByStationId")
	public ResponseEntity<?> getBusByStationId(@RequestParam Long stationId){
		BusDTO busDTO = new BusDTO();
		if(busService.getBusByStationId(stationId)!=null){
			busDTO = busService.getBusByStationId(stationId);
		}
		else {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(busDTO);
	}
}
