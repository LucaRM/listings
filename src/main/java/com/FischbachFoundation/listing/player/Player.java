package com.FischbachFoundation.listing.player;

import java.time.LocalDate;

import com.FischbachFoundation.listing.person.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table

public class Player extends Person{
	public Player() {
	}

	public Player(Long id, String name, String email, LocalDate dateOfBirth , String type) {
		super(id, name, email, dateOfBirth, "Player");
	}

	public Player(String name, String email, LocalDate dateOfBirth, String type) {
		super(name, email, dateOfBirth, "Player");
	}

}