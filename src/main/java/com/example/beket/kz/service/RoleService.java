package com.example.beket.kz.service;

import com.example.beket.kz.dto.PermissionDTO;
import com.example.beket.kz.mapper.PermissionMapper;
import com.example.beket.kz.model.Permissions;
import com.example.beket.kz.repoImpl.PermissionImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {
	private final PermissionImpl permission;

	private final PermissionMapper mapper;

	public Permissions getPermission(){
		return permission.getPermissionByRole("ROLE_USER");
	}

	public List<PermissionDTO> getAllPermission(){
		return mapper.toDtoList(permission.getAllPermissions());
	}

}
