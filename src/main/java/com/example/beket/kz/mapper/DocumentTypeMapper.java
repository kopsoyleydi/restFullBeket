package com.example.beket.kz.mapper;

import com.example.beket.kz.dto.DocumentTypeDTO;
import com.example.beket.kz.model.DocumentType;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DocumentTypeMapper {
	DocumentTypeDTO toDto(DocumentType documentType);

	DocumentType toModel(DocumentTypeDTO busDTO);

	List<DocumentTypeDTO> toDtoList(List<DocumentType> list);

	List<DocumentType> toModelList(List<DocumentTypeDTO> list);
}
