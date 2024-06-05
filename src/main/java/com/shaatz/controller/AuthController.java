package com.shaatz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shaatz.request.AuthenticationRequest;
import com.shaatz.request.RegisterRequest;
import com.shaatz.response.AuthenticationResponse;
import com.shaatz.service.AuthService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import static com.shaatz.utils.Constants.HttpCodes.*;
import static com.shaatz.utils.Constants.RequestMappings.AUTH;
import static com.shaatz.utils.Constants.RequestMappings.REGISTER;
import static com.shaatz.utils.Constants.RequestMappings.AUTHENTICATE;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(AUTH)
@Api(value = AUTH)
@RequiredArgsConstructor
public class AuthController {

	@Autowired
    private AuthService authService;

    @ApiOperation(value = "Register the User")
	@ApiResponses(value = {
			@ApiResponse(code = HTTP_200_CODE, message = HTTP_200_MESSAGE, response = AuthenticationResponse.class),
			@ApiResponse(code = HTTP_400_CODE, message = HTTP_400_MESSAGE),
			@ApiResponse(code = HTTP_401_CODE, message = HTTP_401_MESSAGE),
			@ApiResponse(code = HTTP_403_CODE, message = HTTP_403_MESSAGE),
			@ApiResponse(code = HTTP_404_CODE, message = HTTP_404_MESSAGE),
			@ApiResponse(code = HTTP_429_CODE, message = HTTP_429_MESSAGE),
			@ApiResponse(code = HTTP_500_CODE, message = HTTP_500_MESSAGE) })
    @PostMapping(value = REGISTER, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest registerRequest
    ) {
        AuthenticationResponse authResponse = authService.register(registerRequest);
        return  ResponseEntity.ok(authResponse);
    }

    @ApiOperation(value = "Authenication the User")
	@ApiResponses(value = {
			@ApiResponse(code = HTTP_200_CODE, message = HTTP_200_MESSAGE, response = AuthenticationResponse.class),
			@ApiResponse(code = HTTP_400_CODE, message = HTTP_400_MESSAGE),
			@ApiResponse(code = HTTP_401_CODE, message = HTTP_401_MESSAGE),
			@ApiResponse(code = HTTP_403_CODE, message = HTTP_403_MESSAGE),
			@ApiResponse(code = HTTP_404_CODE, message = HTTP_404_MESSAGE),
			@ApiResponse(code = HTTP_429_CODE, message = HTTP_429_MESSAGE),
			@ApiResponse(code = HTTP_500_CODE, message = HTTP_500_MESSAGE) })
    @PostMapping(value = AUTHENTICATE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
       return ResponseEntity.ok(authService.authenticate(request));
    }

}
