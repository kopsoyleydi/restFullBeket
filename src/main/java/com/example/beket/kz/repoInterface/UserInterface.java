package com.example.beket.kz.repoInterface;

import com.example.beket.kz.model.User;

import java.util.List;

public interface UserInterface {
	User getUserById(Long id);
	User addUser(User user);
	List<User> getAllUsers();

	User updateParam(User user);

	User getUserByEmail(String email);
}
