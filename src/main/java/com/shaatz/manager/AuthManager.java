package com.shaatz.manager;

import java.util.Optional;

import com.shaatz.domain.User;

public interface AuthManager {

	User register(User user);
	
	Optional<User> findByEmail(String email);
}
