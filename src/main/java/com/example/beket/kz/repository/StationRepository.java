package com.example.beket.kz.repository;

import com.example.beket.kz.model.ListOfStation;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface StationRepository extends JpaRepository<ListOfStation,Long> {
	ListOfStation findAllById(Long id);
}
