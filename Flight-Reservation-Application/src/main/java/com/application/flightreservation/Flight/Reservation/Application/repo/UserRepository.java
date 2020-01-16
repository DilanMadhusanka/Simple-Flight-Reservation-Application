package com.application.flightreservation.Flight.Reservation.Application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.flightreservation.Flight.Reservation.Application.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);

}