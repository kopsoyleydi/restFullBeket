package com.example.beket.kz.repoImpl;

import com.example.beket.kz.model.ListOfBus;
import com.example.beket.kz.model.ListOfStation;
import com.example.beket.kz.repoInterface.BusInterface;
import com.example.beket.kz.repository.BusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BusImpl implements BusInterface {

	private final BusRepository busRepository;

	private final StationImpl station;

	@Override
	public ListOfBus getBusById(Long id) {
		return busRepository.findAllById(id);
	}

	@Override
	public List<ListOfBus> getAllBuses() {
		return busRepository.findAll();
	}

	@Override
	public ListOfBus getBusByStationId(Long id) {
		ListOfStation station1 = station.getStationById(id);
		return busRepository.findByStationId(station1);
	}

	@Override
	public ListOfBus createBus(ListOfBus listOfBus) {
		return busRepository.save(listOfBus);
	}

	@Override
	public ListOfBus updateBus(ListOfBus listOfBus) {
		return busRepository.save(listOfBus);
	}

	@Override
	public void deleteBusById(Long id) {
		busRepository.deleteById(id);
	}
}
