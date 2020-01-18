package com.application.flightreservation.Flight.Reservation.Application.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.application.flightreservation.Flight.Reservation.Application.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

	@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	List<Flight> findFlight(@Param("departureCity") String from, @Param("arrivalCity") String to, @Param("dateOfDeparture")Date departureDate);
	
}
