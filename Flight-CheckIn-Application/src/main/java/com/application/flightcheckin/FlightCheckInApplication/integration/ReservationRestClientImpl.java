package com.application.flightcheckin.FlightCheckInApplication.integration;

import org.springframework.web.client.RestTemplate;

import com.application.flightcheckin.FlightCheckInApplication.dto.Reservation;
import com.application.flightcheckin.FlightCheckInApplication.dto.ReservationUpdateRequest;

public class ReservationRestClientImpl implements ReservationRestClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/reservation/"+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
