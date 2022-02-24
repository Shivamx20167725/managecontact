package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}
	
	public void deleteUserById(int id) {
		 userRepository.deleteById(id);
	}
}
