package com.example.beket.kz.repoImpl;

import com.example.beket.kz.model.ListOfCities;
import com.example.beket.kz.repoInterface.CityInterface;
import com.example.beket.kz.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityImpl implements CityInterface {

	private final CityRepository cityRepository;

	@Override
	public ListOfCities getCityById(Long id) {
		return cityRepository.findAllById(id);
	}

	@Override
	public List<ListOfCities> getAllCities() {
		return cityRepository.findAll();
	}

	@Override
	public ListOfCities createCity(ListOfCities listOfCities) {
		return cityRepository.save(listOfCities);
	}

	@Override
	public ListOfCities updateCity(ListOfCities listOfCities) {
		return cityRepository.save(listOfCities);
	}

	@Override
	public void deleteCityById(Long id) {
		cityRepository.deleteById(id);
	}

	public ListOfCities getCityByName(String name){
		return cityRepository.findByName(name);
	}
}
