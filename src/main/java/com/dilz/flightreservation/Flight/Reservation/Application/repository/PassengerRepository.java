package com.dilz.flightreservation.Flight.Reservation.Application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dilz.flightreservation.Flight.Reservation.Application.entities.Passenger;

public interface PassengerRepository extends MongoRepository<Passenger, Long>{

}
