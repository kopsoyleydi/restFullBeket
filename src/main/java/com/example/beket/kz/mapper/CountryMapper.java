package com.example.beket.kz.mapper;

import com.example.beket.kz.dto.CountryDTO;
import com.example.beket.kz.model.Countries;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {
	CountryDTO toDto(Countries countries);

	Countries toModel(CountryDTO busDTO);

	List<CountryDTO> toDtoList(List<Countries> list);

	List<Countries> toModelList(List<CountryDTO> list);
}
