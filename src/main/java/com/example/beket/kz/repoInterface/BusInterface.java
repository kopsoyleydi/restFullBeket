package com.example.beket.kz.repoInterface;

import com.example.beket.kz.model.ListOfBus;
import com.example.beket.kz.model.ListOfStation;

import java.util.List;

public interface BusInterface {

	ListOfBus getBusById(Long id);

	List<ListOfBus> getAllBuses();

	ListOfBus getBusByStationId(Long id);

	ListOfBus createBus(ListOfBus listOfBus);

	ListOfBus updateBus(ListOfBus listOfBus);

	void deleteBusById(Long id);
}
