package com.application.flightreservation.Flight.Reservation.Application.entities;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Role extends AbstractEntity {

	private String name;
	
	private Set<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
}
