package com.example.beket.kz.api;


import com.example.beket.kz.dto.RoadsDTO;
import com.example.beket.kz.service.RoadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class RoadsRest {

	private final RoadService roadService;

	@GetMapping(value = "/getRoads")
	public List<RoadsDTO> getAllRoads(){
		return roadService.getAllRoads();
	}

	@GetMapping(value = "/getRoadByFilter")
	public List<RoadsDTO> getRoadsByFilter(@RequestParam(name = "departureCity") String departureCity,
	                                       @RequestParam(name = "arrivalCity") String arrivalCity,
	                                       @RequestParam(name = "departureDate") String departureDate){
		return roadService.getRoadFyFilter(departureCity, arrivalCity, departureDate);
	}

	@PostMapping(value = "/addNewRoad")
	public RoadsDTO addNewRoad(@RequestBody RoadsDTO roadsDTO){
		return roadService.addNewRoad(roadsDTO);
	}
}
