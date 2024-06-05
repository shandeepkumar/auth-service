package com.shaatz.controller;

import static com.shaatz.utils.Constants.HttpCodes.HTTP_200_CODE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_200_MESSAGE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_400_CODE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_400_MESSAGE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_401_CODE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_401_MESSAGE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_403_CODE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_403_MESSAGE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_404_CODE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_404_MESSAGE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_429_CODE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_429_MESSAGE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_500_CODE;
import static com.shaatz.utils.Constants.HttpCodes.HTTP_500_MESSAGE;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import static com.shaatz.utils.Constants.RequestMappings.ADMIN;

@RestController
@RequestMapping(ADMIN)
@Api(value = ADMIN)
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {
    
    @ApiOperation(value = "hasAuthority('admin:read')")
	@ApiResponses(value = {
			@ApiResponse(code = HTTP_200_CODE, message = HTTP_200_MESSAGE, response = String.class),
			@ApiResponse(code = HTTP_400_CODE, message = HTTP_400_MESSAGE),
			@ApiResponse(code = HTTP_401_CODE, message = HTTP_401_MESSAGE),
			@ApiResponse(code = HTTP_403_CODE, message = HTTP_403_MESSAGE),
			@ApiResponse(code = HTTP_404_CODE, message = HTTP_404_MESSAGE),
			@ApiResponse(code = HTTP_429_CODE, message = HTTP_429_MESSAGE),
			@ApiResponse(code = HTTP_500_CODE, message = HTTP_500_MESSAGE) })
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @PreAuthorize("hasAuthority('admin:read')")
    public String getAdmin() {
        return "Secured Endpoint :: GET - Admin controller";
    }

    @ApiOperation(value = "hasAuthority('admin:create')")
	@ApiResponses(value = {
			@ApiResponse(code = HTTP_200_CODE, message = HTTP_200_MESSAGE, response = String.class),
			@ApiResponse(code = HTTP_400_CODE, message = HTTP_400_MESSAGE),
			@ApiResponse(code = HTTP_401_CODE, message = HTTP_401_MESSAGE),
			@ApiResponse(code = HTTP_403_CODE, message = HTTP_403_MESSAGE),
			@ApiResponse(code = HTTP_404_CODE, message = HTTP_404_MESSAGE),
			@ApiResponse(code = HTTP_429_CODE, message = HTTP_429_MESSAGE),
			@ApiResponse(code = HTTP_500_CODE, message = HTTP_500_MESSAGE) })
    @PostMapping(produces = APPLICATION_JSON_VALUE)
    @PreAuthorize("hasAuthority('admin:create')")
    public String post() {
        return "Secured Endpoint :: POST - Admin controller";
    }

}
