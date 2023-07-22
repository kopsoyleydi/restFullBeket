package com.example.beket.kz.mapper;


import com.example.beket.kz.dto.CityDTO;
import com.example.beket.kz.model.ListOfCities;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {
	CityDTO toDto(ListOfCities cities);

	ListOfCities toModel(CityDTO cityDTO);

	List<CityDTO> toDtoList(List<ListOfCities> list);

	List<ListOfCities> toEventList(List<CityDTO> list);
}