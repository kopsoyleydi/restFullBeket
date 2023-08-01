package com.example.beket.kz.repository;


import com.example.beket.kz.model.Permissions;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface PermissionRepository extends JpaRepository<Permissions,Long> {
	List<Permissions> findAllById(Long id);

	Permissions findByRole(String role);
}
