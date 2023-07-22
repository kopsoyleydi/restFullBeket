package com.example.beket.kz.repoInterface;

import com.example.beket.kz.model.Permissions;

import java.util.List;

public interface PermissionInterface {

	Permissions getPermissionById(Long id);

	List<Permissions> getAllPermissions();
}
