package com.lcwd.user.service.UserService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lcwd.user.service.UserService.payload.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResouceNotFoundException(ResourceNotFoundException ex){
		String message = ex.getMessage();
		ApiResponse reponse = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
	    return new ResponseEntity<ApiResponse>(reponse,HttpStatus.NOT_FOUND);
	}

}
