//package com.application.flightreservation.Flight.Reservation.Application.controller;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.application.flightreservation.Flight.Reservation.Application.repo.FlightRepository;
//
//@RestController
//public class FlightController {
//	
//	@Autowired
//	FlightRepository flightRepository;
//
//	@RequestMapping("findFlight")
//	public String findFlight(@RequestParam String from, @RequestParam String to, @RequestParam String departureDate) throws ParseException {
//		//System.out.println(departureDate);
//		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(departureDate);
//		flightRepository.findFlight(from, to, date);
//		return "";
//	}
//}
