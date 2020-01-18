package com.application.flightreservation.Flight.Reservation.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.application.flightreservation.Flight.Reservation.Application.entities.Flight;
import com.application.flightreservation.Flight.Reservation.Application.repo.FlightRepository;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Flight flight = flightRepository.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
	}
}
