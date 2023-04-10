package com.FischbachFoundation.listing.race;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table

public class Race {
	@Id
	@SequenceGenerator(name = "race_sequence", sequenceName = "race_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "race_sequence")
    private Long id;
    private String name;
	private Integer abilityScoreIncrease;
	private Integer age;
	private String size;
	private Integer speed;
	private String darkvision;
	private String[] languages;

	public Race() {
	}

	public Race(Long id, String name, Integer abilityScoreIncrease, Integer age, String size, Integer speed, String darkvision, String[] languages) {
		this.id = id;
		this.name = name;
		this.abilityScoreIncrease = abilityScoreIncrease;
		this.age = age;
		this.size = size;
		this.speed = speed;
		this.darkvision = darkvision;
		this.languages = languages;
	}

	public Race(String name, Integer abilityScoreIncrease, Integer age, String size, Integer speed, String darkvision, String[] languages) {
		this.name = name;
		this.abilityScoreIncrease = abilityScoreIncrease;
		this.age = age;
		this.size = size;
		this.speed = speed;
		this.darkvision = darkvision;
		this.languages = languages;
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

	public Integer getAbilityScoreIncrease() {
		return abilityScoreIncrease;
	}

	public void setAbilityScoreIncrease(Integer abilityScoreIncrease) {
		this.abilityScoreIncrease = abilityScoreIncrease;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public String getDarkvision() {
		return darkvision;
	}

	public void setDarkvision(String darkvision) {
		this.darkvision = darkvision;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Race {" +
			"id=" + id +
			", name='" + name + '\'' +
			", abilityScoreIncrease=" + abilityScoreIncrease +
			", age=" + age +
			", size='" + size + '\'' +
			", speed=" + speed +
			", darkvision='" + darkvision + '\'' +
			", languages=" + languages +
			'}';
	}

}