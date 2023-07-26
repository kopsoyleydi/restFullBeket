package com.example.beket.kz.service;

import com.example.beket.kz.model.ListOfRoads;
import com.example.beket.kz.model.Ticket;
import com.example.beket.kz.repoImpl.TicketImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CheckPlaceInBus {

	private final TicketImpl ticketImpl;

	private final PlaceService placeService;

	public List<Integer> minusBookPlaces(ListOfRoads listOfRoads){
		List<Integer> places = placeService.getPlaces();
		List<Ticket> ticket = ticketImpl.getTicketByRoadId(listOfRoads);
		for(int i = 1;i<31;i++){
			int index = 0;
			if(places.get(i) == ticket.get(i).getPlace()){
				index = i;
			}
			places.remove(index);
		}
		return places;
	}
}
