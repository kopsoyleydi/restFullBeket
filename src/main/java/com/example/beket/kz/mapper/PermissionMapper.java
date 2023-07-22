package com.example.beket.kz.mapper;



import com.example.beket.kz.dto.PermissionDTO;
import org.mapstruct.Mapper;

import java.security.Permission;
import java.security.Permissions;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
	PermissionDTO toDto(Permissions permission);

	Permissions toModel(PermissionDTO permissionDTO);

	List<PermissionDTO> toDtoList(List<Permissions> list);

	List<Permissions> toPermissionList(List<PermissionDTO> list);
}