package com.FischbachFoundation.listing.person;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table

public class Person {
	@Id
	@SequenceGenerator(name = "person_sequence", sequenceName = "person_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_sequence")
    private Long id;
    private String name;
    private String email;
	private LocalDate dateOfBirth;
	private String type;
	@Transient
	private Integer age;

	public enum Type {
		student,
		player
	}

	public Person() {
	}

	public Person(Long id, String name, String email, LocalDate dateOfBirth, String type) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.type = type;
	}

	public Person(String name, String email, LocalDate dateOfBirth, String type) {
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getAge() {
		return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person {" +
			"id=" + id +
			", name='" + name + '\'' +
			", email='" + email + '\'' +
			", dateOfBirth=" + dateOfBirth +
			", age=" + age +
			", type='" + type + '\'' +
			'}';
	}

}