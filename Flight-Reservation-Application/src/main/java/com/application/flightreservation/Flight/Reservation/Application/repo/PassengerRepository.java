package com.application.flightreservation.Flight.Reservation.Application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.flightreservation.Flight.Reservation.Application.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
