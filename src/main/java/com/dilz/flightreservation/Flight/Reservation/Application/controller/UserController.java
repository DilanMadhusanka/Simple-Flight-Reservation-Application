package com.dilz.flightreservation.Flight.Reservation.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dilz.flightreservation.Flight.Reservation.Application.entities.User;
//import com.dilz.flightreservation.Flight.Reservation.Application.repository.UserRepository;

@RestController
public class UserController {
	
//	@Autowired
//	UserRepository userRepository;

	@RequestMapping("/login")
	public User saveData(@RequestBody User user) {
		System.out.println(user);
		//userRepository.save(new User(user.getId(),user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword()));
		return user;
		
	}
}
