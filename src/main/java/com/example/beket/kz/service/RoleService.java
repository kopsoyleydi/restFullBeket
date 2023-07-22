package com.example.beket.kz.service;

import com.example.beket.kz.model.Permissions;
import com.example.beket.kz.repoImpl.PermissionImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
	private final PermissionImpl permission;

	public Permissions getPermission(){
		return permission.getPermissionByRole("ROLE_USER");
	}
}
