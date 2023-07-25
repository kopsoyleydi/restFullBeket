package com.example.beket.kz.service;


import com.example.beket.kz.dto.BusDTO;
import com.example.beket.kz.mapper.BusMapper;
import com.example.beket.kz.repoImpl.BusImpl;
import com.example.beket.kz.repoImpl.StationImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusService {

	private final BusImpl busImpl;

	private final StationImpl stationImpl;

	private final BusMapper busMapper;

	public BusDTO getBusByStationId(Long id){
		return busMapper.toDto(busImpl.getBusByStationId(id));
	}
}
