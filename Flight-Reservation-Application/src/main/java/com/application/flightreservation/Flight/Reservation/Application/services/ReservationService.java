package com.application.flightreservation.Flight.Reservation.Application.services;

import com.application.flightreservation.Flight.Reservation.Application.dto.ReservationRequest;
import com.application.flightreservation.Flight.Reservation.Application.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);
}
