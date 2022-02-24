package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Phone;
import com.example.demo.repository.PhoneRepository;

@Service
public class PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;
	
	
	public Phone savePhone(Phone phone) {
		return phoneRepository.save(phone);
	}
	
	public List<Phone> getPhones() {
		return phoneRepository.findAll();
	}
}
