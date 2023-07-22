package com.example.beket.kz.repoInterface;

import com.example.beket.kz.model.ListOfCities;

import java.util.List;

public interface CityInterface {

	ListOfCities getCityById(Long id);

	List<ListOfCities> getAllCities();

	ListOfCities createCity(ListOfCities listOfCities);

	ListOfCities updateCity(ListOfCities listOfCities);

	void deleteCityById(Long id);

}
