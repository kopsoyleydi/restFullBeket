package com.example.beket.kz.repository;

import com.example.beket.kz.model.ListOfRoads;
import com.example.beket.kz.model.Ticket;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface TicketRepository extends JpaRepository<Ticket,Long> {
	List<Ticket> findAll();

	Ticket findAllById(Long id);

	List<Ticket> findAllByUserId(Long id);

	List<Ticket> findAllByRoadId(ListOfRoads roadId);
}
