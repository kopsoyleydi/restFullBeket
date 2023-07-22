package com.example.beket.kz.repository;


import com.example.beket.kz.model.Permissions;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PermissionRepository extends JpaRepository<Permissions,Long> {
	Permissions findAllById(Long id);

	Permissions findByRole(String role);
}
