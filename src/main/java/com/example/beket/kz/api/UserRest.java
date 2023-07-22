package com.example.beket.kz.api;


import com.example.beket.kz.model.User;
import com.example.beket.kz.repoImpl.UserImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
@RequiredArgsConstructor
public class UserRest {
	private final UserImpl userImpl;

	@PreAuthorize("isAuthenticated()")
	@GetMapping(value = "/getAllUsers")
	public List<User> getAllUsers(){
		return userImpl.getAllUsers();
	}
}
