package com.example.beket.kz.api;

import com.example.beket.kz.model.ListOfRoads;
import com.example.beket.kz.repoImpl.RoadImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class RoadsRest {

	private final RoadImpl road;

	@GetMapping(value = "/getRoads")
	public List<ListOfRoads> getAllRoads(){
		return road.getAllRoads();
	}
}
