package com.example.beket.kz.service;


import com.example.beket.kz.dto.FilterDTO;
import com.example.beket.kz.dto.RoadsDTO;
import com.example.beket.kz.mapper.RoadsMapper;
import com.example.beket.kz.model.ListOfBus;
import com.example.beket.kz.model.ListOfCities;
import com.example.beket.kz.model.ListOfRoads;
import com.example.beket.kz.repoImpl.BusImpl;
import com.example.beket.kz.repoImpl.CityImpl;
import com.example.beket.kz.repoImpl.RoadImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoadService {

	private final RoadImpl road;

	private final RoadsMapper roadsMapper;

	private final CityImpl city;

	private final BusImpl bus;

	public List<RoadsDTO> getAllRoads(){
		return roadsMapper.toDtoList(road.getAllRoads());
	}

	public List<RoadsDTO> getRoadFyFilter(FilterDTO filterDTO){
		String departure = filterDTO.getDepartureCity();
		String arrival = filterDTO.getArrivalCity();
		String departureDate = filterDTO.getDepartureDate();
		return roadsMapper.toDtoList(road.getRoadsFyFilter(departure,arrival,departureDate));
	}

	public RoadsDTO addNewRoad(RoadsDTO roadsDTO){
		ListOfRoads Ofroad = new ListOfRoads();
		ListOfCities cities = city.getCityById(roadsDTO.getDeparture().getId());
		ListOfCities cities1 = city.getCityById(roadsDTO.getArrival().getId());
		ListOfBus ofBus = bus.getBusById(roadsDTO.getBus_id().getId());
		Ofroad.setDeparture(cities);
		Ofroad.setArrival(cities1);
		Ofroad.setBus_id(ofBus);
		Ofroad.setDeparture_date(roadsDTO.getDeparture_date());
		Ofroad.setDeparture_time(roadsDTO.getDeparture_time());
		Ofroad.setArrival_date(roadsDTO.getArrival_date());
		Ofroad.setArrival_time(roadsDTO.getArrival_time());
		return roadsMapper.toDto(road.createRoad(Ofroad));
	}
}
