package com.shaatz.manager.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shaatz.domain.User;
import com.shaatz.manager.AuthManager;
import com.shaatz.repository.UserRepository;

@Component
public class AuthManagerImpl implements AuthManager {

	@Autowired
	private UserRepository userRepository;
	
	public User register(User user) {
		
		return userRepository.save(user);
	}
	
	public Optional<User> findByEmail(String email) {
		
		return userRepository.findByEmail(email);
	}
	
}
