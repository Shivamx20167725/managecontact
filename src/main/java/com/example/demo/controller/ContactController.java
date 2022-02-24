package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Phone;
import com.example.demo.entity.User;
import com.example.demo.service.PhoneService;
import com.example.demo.service.UserService;

@RestController
public class ContactController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private PhoneService phoneService;	

	//Add a user to the system
	//localhost:8080/adduser
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
				
		return userService.saveUser(user);
	}
	
	//Delete a user from the system
	//localhost:8080/deleteuser/1
	@DeleteMapping("/deleteuser/{id}")
	  void deleteEmployee(@PathVariable int id) {
		 userService.deleteUserById(id);
	  }
	//List users in the system
	//localhost:8080/users
	@GetMapping("/users")
	public List<User> getUsers() {
		
		return userService.getUsers();
	}
	
	//Add a phone to a user
	//localhost:8080/addphone/1
	@PostMapping("/addphone/{id}")
	public Phone addPhone(@RequestBody Phone phone, @PathVariable int id) {	
		User user = userService.getUserById(id);		
		phone.setUser(user);
		return phoneService.savePhone(phone);
	}
	
	//List phones
	//localhost:8080/phones
	@GetMapping("/phones")
	public List<Phone> getPhones() {		
		return phoneService.getPhones();
	}
	
}
