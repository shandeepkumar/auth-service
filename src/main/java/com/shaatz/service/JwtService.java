package com.shaatz.service;

import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Claims;

public interface JwtService {

	String generateToken(UserDetails user);
	
	String extractUsername(String token);
	
	<T> T extractClaim(String token, Function<Claims, T> claimsResolver);
	
	boolean isTokenValid(String token, UserDetails userDetails);
}
