package com.example.beket.kz.repoImpl;

import com.example.beket.kz.model.ListOfRoads;
import com.example.beket.kz.repoInterface.RoadInterface;
import com.example.beket.kz.repository.RoadsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoadImpl implements RoadInterface {

	private final RoadsRepository roadsRepository;

	@Override
	public ListOfRoads getRoadById(Long id) {
		return roadsRepository.findAllById(id);
	}

	@Override
	public List<ListOfRoads> getAllRoads() {
		return roadsRepository.findAll();
	}

	@Override
	public ListOfRoads createRoad(ListOfRoads listOfRoads) {
		return roadsRepository.save(listOfRoads);
	}

	@Override
	public ListOfRoads updateRoad(ListOfRoads listOfRoads) {
		return roadsRepository.save(listOfRoads);
	}

	@Override
	public void deleteRoadById(Long id) {
		roadsRepository.deleteById(id);
	}

	@Override
	public List<ListOfRoads> getRoadsByDepartureCityId(Long id) {
		return roadsRepository.findAllByDepartureId(id);
	}

	public List<ListOfRoads> getRoadsFyFilter(String departure,String arrival, String departureDate){
		return roadsRepository.getRoadByFilterParameter(departure,arrival,departureDate);
	}
}
