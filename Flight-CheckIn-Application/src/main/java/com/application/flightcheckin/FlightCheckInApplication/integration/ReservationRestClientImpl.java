package com.application.flightcheckin.FlightCheckInApplication.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.application.flightcheckin.FlightCheckInApplication.dto.Reservation;
import com.application.flightcheckin.FlightCheckInApplication.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	private static final String RESERVATIONS_REST_URL = "http://localhost:8080/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATIONS_REST_URL + id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATIONS_REST_URL, request, Reservation.class);
		return reservation;
	}

}
