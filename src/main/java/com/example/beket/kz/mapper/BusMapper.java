package com.example.beket.kz.mapper;

import com.example.beket.kz.dto.BusDTO;
import com.example.beket.kz.model.ListOfBus;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BusMapper {
	BusDTO toDto(ListOfBus buses);

	ListOfBus toModel(BusDTO busDTO);

	List<BusDTO> toDtoList(List<ListOfBus> list);

	List<ListOfBus> toEventList(List<BusDTO> list);
}