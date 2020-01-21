package com.application.flightreservation.Flight.Reservation.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.application.flightreservation.Flight.Reservation.Application.dto.ReservationRequest;
import com.application.flightreservation.Flight.Reservation.Application.entities.Flight;
import com.application.flightreservation.Flight.Reservation.Application.entities.Reservation;
import com.application.flightreservation.Flight.Reservation.Application.repo.FlightRepository;
import com.application.flightreservation.Flight.Reservation.Application.services.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Flight flight = flightRepository.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation", method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservaton created succesfully and the id is "+ reservation.getId());
		return "reservationConfirmation";
	}
}
