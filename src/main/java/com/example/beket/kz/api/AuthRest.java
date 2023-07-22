package com.example.beket.kz.api;

import com.example.beket.kz.dto.AuthRequest;
import com.example.beket.kz.dto.RegistrationUserDto;
import com.example.beket.kz.service.AuthService;
import com.example.beket.kz.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthRest {

	private final UserService userService;

	private final AuthService authService;
	@PostMapping("/auth")
	public ResponseEntity<?> createAuthToken(@RequestBody AuthRequest authRequest) {
		return authService.createAuthToken(authRequest);
	}

	@PostMapping("/registration")
	public ResponseEntity<?> createNewUser(@RequestBody RegistrationUserDto registrationUserDto) {
		return authService.createNewUser(registrationUserDto);
	}


}
