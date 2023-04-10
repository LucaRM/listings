package com.FischbachFoundation.listing.student;

import java.time.LocalDate;

import com.FischbachFoundation.listing.person.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table

public class Student extends Person{

	public Student() {
	}

	public Student(Long id, String name, String email, LocalDate dateOfBirth, String type) {
		super(id, name, email, dateOfBirth, "Student");
	}

	public Student(String name, String email, LocalDate dateOfBirth, String type) {
		super(name, email, dateOfBirth, "Student");
	}

}