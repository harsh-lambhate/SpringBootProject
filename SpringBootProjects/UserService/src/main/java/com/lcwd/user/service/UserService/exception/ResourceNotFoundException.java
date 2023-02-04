package com.lcwd.user.service.UserService.exception;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	//extra property that you want to manage
	 public ResourceNotFoundException() {
		 super("Resource not found exception !!");
	 }
	 
	 public ResourceNotFoundException(String message) {
		 super(message);
	 }
	 
	 
  
}
