package com.example.beket.kz.repoImpl;

import com.example.beket.kz.model.User;
import com.example.beket.kz.repoInterface.UserInterface;
import com.example.beket.kz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserImpl implements UserInterface {

	private final UserRepository userRepository;
	@Override
	public User getUserById(Long id) {
		return userRepository.findAllById(id);
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User updateParam(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserByEmail(String username) {
		return userRepository.findByUsername(username);
	}
}
