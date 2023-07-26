package com.example.beket.kz.repository;

import com.example.beket.kz.model.Countries;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CountriesRepository extends JpaRepository<Countries,Long> {
	Countries findAllById(Long id);
}
