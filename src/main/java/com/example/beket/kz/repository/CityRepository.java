package com.example.beket.kz.repository;

import com.example.beket.kz.model.ListOfCities;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CityRepository extends JpaRepository<ListOfCities,Long> {
	ListOfCities findAllById(Long id);

}
