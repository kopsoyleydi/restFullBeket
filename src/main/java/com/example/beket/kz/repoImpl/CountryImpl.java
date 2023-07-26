package com.example.beket.kz.repoImpl;

import com.example.beket.kz.model.Countries;
import com.example.beket.kz.repoInterface.CountriesInterface;
import com.example.beket.kz.repository.CountriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryImpl implements CountriesInterface {

	private final CountriesRepository countriesRepository;
	@Override
	public Countries getCountryById(Long id) {
		return countriesRepository.findAllById(id);
	}

	@Override
	public List<Countries> getAllCountries() {
		return countriesRepository.findAll();
	}
}
