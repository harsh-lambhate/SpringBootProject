package com.lcwd.user.service.UserService.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.exception.ResourceNotFoundException;
import com.lcwd.user.service.UserService.repository.UserRepository;
import com.lcwd.user.service.UserService.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired(required=false)
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		
		return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with givn Id "+userId+" is not found"));
	}

	@Override
	public void deleteUserById(User userId) {
		userRepository.delete(userId);
	}

	@Override
	public User updateUserById(User userId) {
		return userRepository.save(userId);
	}
	

}
