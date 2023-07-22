package com.example.beket.kz.repository;

import com.example.beket.kz.model.ListOfBus;
import com.example.beket.kz.model.ListOfStation;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface BusRepository extends JpaRepository<ListOfBus,Long> {
	ListOfBus findAllById(Long id);

	ListOfBus findByStationId(ListOfStation stationId);
}
