package com.example.beket.kz.api;

import com.example.beket.kz.dto.FilterDTO;
import com.example.beket.kz.dto.RoadsDTO;
import com.example.beket.kz.service.RoadService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class RoadsRest {

	private final RoadService roadService;

	@PreAuthorize("isAuthenticated()")
	@GetMapping(value = "/getRoads")
	public List<RoadsDTO> getAllRoads(){
		return roadService.getAllRoads();
	}

	@PreAuthorize("isAuthenticated()")
	@GetMapping(value = "/getRoadByFilter")
	public List<RoadsDTO> getRoadsByFilter(@RequestBody FilterDTO filterDTO){
		return roadService.getRoadFyFilter(filterDTO);
	}
}
