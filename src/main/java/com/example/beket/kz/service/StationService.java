package com.example.beket.kz.service;


import com.example.beket.kz.dto.StationDTO;
import com.example.beket.kz.mapper.StationMapper;
import com.example.beket.kz.repoImpl.StationImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StationService {

	private final StationImpl station;

	private final StationMapper stationMapper;

	public List<StationDTO> getAllStations(){
		return stationMapper.toDtoList(station.getAllStations());
	}

	public List<StationDTO> getStationsByCityId(Long id){
		return stationMapper.toDtoList(station.getStationsByCityId(id));
	}
}
