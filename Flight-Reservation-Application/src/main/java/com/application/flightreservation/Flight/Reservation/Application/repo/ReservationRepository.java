package com.application.flightreservation.Flight.Reservation.Application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.flightreservation.Flight.Reservation.Application.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
