package com.example.beket.kz.repoInterface;

import com.example.beket.kz.model.ListOfRoads;

import java.util.List;

public interface RoadInterface {

	ListOfRoads getRoadById(Long id);

	List<ListOfRoads> getAllRoads();

	ListOfRoads createRoad(ListOfRoads listOfRoads);

	ListOfRoads updateRoad(ListOfRoads listOfRoads);

	void deleteRoadById(Long id);

	List<ListOfRoads> getRoadsByDepartureCityId(Long id);
}
