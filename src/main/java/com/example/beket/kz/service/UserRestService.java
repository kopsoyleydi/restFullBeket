package com.example.beket.kz.service;


import com.example.beket.kz.dto.MainUserDTO;
import com.example.beket.kz.mapper.MainUserMapper;
import com.example.beket.kz.repoImpl.UserImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRestService {

	private final UserImpl userImpl;

	private final MainUserMapper mapper;

	private final UserService userService;

	public MainUserDTO getSessionUser(){
		return mapper.toDtoUser(userService.getCurrentSessionUser());
	}

	public MainUserDTO updateUser(MainUserDTO mainUserDTO){
		return mapper.toDtoUser(userImpl.updateParam(mapper.toModelUser(mainUserDTO)));
	}



}
