package com.example.beket.kz.api;


import com.example.beket.kz.dto.MainUserDTO;
import com.example.beket.kz.service.AdminRestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/admin")
public class AdminRest {

	private final AdminRestService adminRestService;

	@GetMapping(value = "/getAllUsers")
	public List<MainUserDTO> getAllUsers(){
		return adminRestService.getAllUsers();
	}
}
