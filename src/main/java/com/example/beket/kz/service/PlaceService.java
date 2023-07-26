package com.example.beket.kz.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaceService {

	private static final List<Integer> places = new ArrayList<>();

	static {
		for (int i = 1;i<31;i++){
			places.add(i);
		}
	}

	public void minusPlace(int place){
		int index = 0;
		for(int i = 0;i<places.size();i++){
			if(places.get(i).equals(place)){
				index = i;
			}
		}
		places.remove(index);
	}

	public List<Integer> getPlaces(){
		return places;
	}
}
