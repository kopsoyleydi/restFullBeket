package com.example.beket.kz.repoInterface;

import com.example.beket.kz.model.ListOfStation;

import java.util.List;

public interface StationInterface {

	ListOfStation getStationById(Long id);

	ListOfStation createStation(ListOfStation listOfStation);

	ListOfStation updateStation(ListOfStation listOfStation);

	List<ListOfStation> getAllStations();

	void deleteStationById(Long id);
}
