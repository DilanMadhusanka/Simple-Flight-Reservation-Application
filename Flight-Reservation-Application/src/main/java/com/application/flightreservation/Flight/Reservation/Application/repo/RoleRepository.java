package com.application.flightreservation.Flight.Reservation.Application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.flightreservation.Flight.Reservation.Application.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
