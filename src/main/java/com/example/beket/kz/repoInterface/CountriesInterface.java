package com.example.beket.kz.repoInterface;

import com.example.beket.kz.model.Countries;

import java.util.List;

public interface CountriesInterface {

	Countries getCountryById(Long id);

	List<Countries> getAllCountries();
}
