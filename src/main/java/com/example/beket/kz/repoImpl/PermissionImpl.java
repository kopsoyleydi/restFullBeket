package com.example.beket.kz.repoImpl;

import com.example.beket.kz.model.Permissions;
import com.example.beket.kz.repoInterface.PermissionInterface;
import com.example.beket.kz.repository.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermissionImpl implements PermissionInterface {

	private final PermissionRepository permissionRepository;

	@Override
	public Permissions getPermissionById(Long id) {
		return permissionRepository.findAllById(id);
	}

	@Override
	public List<Permissions> getAllPermissions() {
		return permissionRepository.findAll();
	}

	public Permissions getPermissionByRole(String role){
		return permissionRepository.findByRole(role);
	}
}
