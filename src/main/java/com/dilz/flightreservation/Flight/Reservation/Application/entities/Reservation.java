package com.dilz.flightreservation.Flight.Reservation.Application.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reservation extends AbstractEntity {

	private Boolean checkedIn;
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;
	
	public Reservation() {
		
	}
	
	public Reservation(Boolean checkedIn, int numberOfBags, Passenger passenger, Flight flight) {
		super();
		this.checkedIn = checkedIn;
		this.numberOfBags = numberOfBags;
		this.passenger = passenger;
		this.flight = flight;
	}
	
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
}
