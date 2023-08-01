package com.example.beket.kz.service;

import com.example.beket.kz.dto.AuthRequest;
import com.example.beket.kz.dto.RegistrationUserDto;
import com.example.beket.kz.mapper.RegistrationUserMapper;
import com.example.beket.kz.model.Permissions;
import com.example.beket.kz.model.User;
import com.example.beket.kz.repoImpl.CountryImpl;
import com.example.beket.kz.repoImpl.PermissionImpl;
import com.example.beket.kz.repoImpl.UserImpl;
import com.example.beket.kz.utils.JwtTokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public class UserService implements UserDetailsService {

	@Autowired
	private UserImpl userImpl;

	@Autowired
	private RegistrationUserMapper registrationUserMapper;

	@Autowired
	private JwtTokenUtils jwtTokenUtils;

	@Autowired
	private PermissionImpl permission;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private CountryImpl countryImpl;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userImpl.getUserByEmail(username);
		if (user != null) {
			return user;
		} else {
			throw new UsernameNotFoundException("User Not found");
		}
	}

	public User getCurrentSessionUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			return (User) authentication.getPrincipal();
		}
		return null;
	}

	public User findByUsername(String username) {
		return userImpl.getUserByEmail(username);
	}

	public User createNewUser(RegistrationUserDto registrationUserDto){
		User user = new User();
		user.setEmail(registrationUserDto.getEmail());
		user.setPermissions(permission.getPermissionById(1L));
		user.setPassword(passwordEncoder.encode(registrationUserDto.getPassword()));
		return userImpl.addUser(user);
	}

	public String authUser(AuthRequest authRequest){
		UserDetails userDetails = null;
		try {
			userDetails = loadUserByUsername(authRequest.getEmail());
		}catch (Exception e){
			e.printStackTrace();
		}
		assert userDetails != null;
		return jwtTokenUtils.generateToken(userDetails);
	}
	public User getProfile(String token){
		return userImpl.getUserByEmail(jwtTokenUtils.extractUsername(token));
	}
}
