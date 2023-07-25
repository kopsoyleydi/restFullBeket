package com.example.beket.kz.repoImpl;

import com.example.beket.kz.model.ListOfCities;
import com.example.beket.kz.model.ListOfStation;
import com.example.beket.kz.repoInterface.StationInterface;
import com.example.beket.kz.repository.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StationImpl implements StationInterface {

	private final StationRepository stationRepository;

	private final CityImpl cityImpl;


	@Override
	public ListOfStation getStationById(Long id) {
		return stationRepository.findAllById(id);
	}

	@Override
	public ListOfStation createStation(ListOfStation listOfStation) {
		return stationRepository.save(listOfStation);
	}

	@Override
	public ListOfStation updateStation(ListOfStation listOfStation) {
		return stationRepository.save(listOfStation);
	}

	@Override
	public List<ListOfStation> getAllStations() {
		return stationRepository.findAll();
	}

	@Override
	public void deleteStationById(Long id) {
		stationRepository.deleteById(id);
	}

	public List<ListOfStation> getStationsByCityId(Long id){
		ListOfCities cities = cityImpl.getCityById(id);
		String name = cities.getName();
		ListOfCities cityByName = cityImpl.getCityByName(name);
		return cityByName.getStations();
	}
}
