package com.example.beket.kz.api;


import com.example.beket.kz.dto.MainUserDTO;
import com.example.beket.kz.dto.TokenDTO;
import com.example.beket.kz.service.UserRestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
@RequiredArgsConstructor
public class UserRest {
	private final UserRestService userRestService;

	@GetMapping(value = "/getProfile")
	public MainUserDTO getProfile(@RequestBody TokenDTO tokenDTO){
		return userRestService.getProfile(tokenDTO.getToken());
	}

	@PutMapping (value = "/updateUserParam")
	public MainUserDTO updateUser(@RequestBody MainUserDTO mainUserDTO){
		return userRestService.updateUser(mainUserDTO);
	}
}
