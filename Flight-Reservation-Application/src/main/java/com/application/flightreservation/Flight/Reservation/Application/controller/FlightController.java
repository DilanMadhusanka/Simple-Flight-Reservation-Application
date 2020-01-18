package com.application.flightreservation.Flight.Reservation.Application.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.application.flightreservation.Flight.Reservation.Application.entities.Flight;
import com.application.flightreservation.Flight.Reservation.Application.repo.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("findFlights")
	public String findFlight(@RequestParam String from, @RequestParam String to, 
			@RequestParam @DateTimeFormat(pattern="MM-dd-yyyy") Date departureDate, ModelMap modelMap) {
		
		List<Flight> flights = flightRepository.findFlight(from, to, departureDate);
		modelMap.addAttribute("flights", flights);
		return "displayFlights";
	}
}
