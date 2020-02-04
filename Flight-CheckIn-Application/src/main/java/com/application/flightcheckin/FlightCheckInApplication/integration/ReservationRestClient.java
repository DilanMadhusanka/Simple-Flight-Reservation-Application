package com.application.flightcheckin.FlightCheckInApplication.integration;

import com.application.flightcheckin.FlightCheckInApplication.dto.Reservation;
import com.application.flightcheckin.FlightCheckInApplication.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
