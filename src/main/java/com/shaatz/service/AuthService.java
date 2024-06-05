package com.shaatz.service;

import com.shaatz.request.AuthenticationRequest;
import com.shaatz.request.RegisterRequest;
import com.shaatz.response.AuthenticationResponse;

public interface AuthService {
	
	AuthenticationResponse register(RegisterRequest registerRequest);
	
	AuthenticationResponse authenticate(AuthenticationRequest request);
}

