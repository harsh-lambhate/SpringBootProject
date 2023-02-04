package com.lcwd.user.service.UserService.services;

import java.util.List;

import com.lcwd.user.service.UserService.entities.User;


public interface UserService {

	//save user
	User saveUser(User user);
	//get all user
	List<User> getAllUser();
	//get single user of given userId
	User getUser(String userId);
    //delete user for given userId
     void  deleteUserById(User userId); 
    //update user for given userId
     User updateUserById(User userId);
    
	
}
