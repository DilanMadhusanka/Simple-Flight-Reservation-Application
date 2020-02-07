package com.application.flightcheckin.FlightCheckInApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckInController {

	@RequestMapping("/showStartCheckIn")
	public String showStartCheckIn() {
		return "startCheckIn";
	}
}
