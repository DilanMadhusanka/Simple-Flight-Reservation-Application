package com.dilz.flightreservation.Flight.Reservation.Application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dilz.flightreservation.Flight.Reservation.Application.entities.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, Long>{

}
