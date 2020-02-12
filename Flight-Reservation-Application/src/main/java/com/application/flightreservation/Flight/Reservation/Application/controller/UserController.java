package com.application.flightreservation.Flight.Reservation.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.application.flightreservation.Flight.Reservation.Application.entities.User;
import com.application.flightreservation.Flight.Reservation.Application.repo.UserRepository;
import com.application.flightreservation.Flight.Reservation.Application.services.SecurityService;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private SecurityService securityService;
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}
	
	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
		return "login/login";
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap model) {
		
		boolean loginResponse = securityService.login(email, password);
		
		if(loginResponse) {
			return "findFlights";
		}
		else {
			model.addAttribute("msg", "Invalid username or password. Please try again");
		}
		return "login/login";
	}
}
