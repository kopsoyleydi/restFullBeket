package com.example.beket.kz.mapper;


import com.example.beket.kz.dto.RoadsDTO;
import com.example.beket.kz.model.ListOfRoads;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoadsMapper {
	RoadsDTO toDto(ListOfRoads roads);

	ListOfRoads toModel(RoadsDTO roadsDTO);

	List<RoadsDTO> toDtoList(List<ListOfRoads> list);

	List<ListOfRoads> toEventList(List<RoadsDTO> list);
}