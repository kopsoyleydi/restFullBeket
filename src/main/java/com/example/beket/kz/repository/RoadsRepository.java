package com.example.beket.kz.repository;

import com.example.beket.kz.model.ListOfRoads;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface RoadsRepository extends JpaRepository<ListOfRoads,Long> {
	ListOfRoads findAllById(Long id);

	@Query("SELECT r FROM ListOfRoads r " +
			"WHERE r.departure.name = :departureCity " +
			"AND r.arrival.name = :arrivalCity " +
			"AND r.departure_date = :departureDate")
	List<ListOfRoads> getRoadByFilterParameter(@Param("departureCity") String departureCity,
	                                           @Param("arrivalCity") String arrivalCity,
	                                           @Param("departureDate") String departureDate);

	List<ListOfRoads> findAllByDepartureId(Long id);
}
