package com.example.beket.kz.service;

import com.example.beket.kz.dto.CityDTO;
import com.example.beket.kz.mapper.CityMapper;
import com.example.beket.kz.repoImpl.CityImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CityService {
	private final CityImpl city;

	private final CityMapper cityMapper;

	public List<CityDTO> getAllCities(){
		return cityMapper.toDtoList(city.getAllCities());
	}
}
