package com.example.beket.kz.service;


import com.example.beket.kz.dto.FilterDTO;
import com.example.beket.kz.dto.RoadsDTO;
import com.example.beket.kz.mapper.RoadsMapper;
import com.example.beket.kz.repoImpl.RoadImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoadService {

	private final RoadImpl road;

	private final RoadsMapper roadsMapper;

	public List<RoadsDTO> getAllRoads(){
		return roadsMapper.toDtoList(road.getAllRoads());
	}

	public List<RoadsDTO> getRoadFyFilter(FilterDTO filterDTO){
		String departure = filterDTO.getDepartureCity();
		String arrival = filterDTO.getArrivalCity();
		String departureDate = filterDTO.getDepartureDate();
		return roadsMapper.toDtoList(road.getRoadsFyFilter(departure,arrival,departureDate));
	}
}
