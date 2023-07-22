package com.example.beket.kz.mapper;


import com.example.beket.kz.dto.StationDTO;
import com.example.beket.kz.model.ListOfStation;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StationMapper {
	StationDTO toDto(ListOfStation station);

	ListOfStation toModel(StationDTO stationDTO);

	List<StationDTO> toDtoList(List<ListOfStation> list);

	List<ListOfStation> toEventList(List<StationDTO> list);
}