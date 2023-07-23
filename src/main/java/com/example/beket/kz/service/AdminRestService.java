package com.example.beket.kz.service;


import com.example.beket.kz.dto.MainUserDTO;
import com.example.beket.kz.dto.RoadsDTO;
import com.example.beket.kz.mapper.MainUserMapper;
import com.example.beket.kz.mapper.RoadsMapper;
import com.example.beket.kz.repoImpl.RoadImpl;
import com.example.beket.kz.repoImpl.UserImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminRestService {
	private final RoadImpl road;

	private final RoadsMapper roadsMapper;

	private final UserImpl user;

	private final MainUserMapper userMapper;

	public RoadsDTO addNewRoad(RoadsDTO roadsDTO){
		return roadsMapper.toDto(road.createRoad(roadsMapper.toModel(roadsDTO)));
	}

	public List<MainUserDTO> getAllUsers(){
		return userMapper.toDtoListUser(user.getAllUsers());
	}


}
