package com.example.beket.kz.repository;

import com.example.beket.kz.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,Long> {
	User findByUsername(String email);

	User findAllById(Long id);

}
