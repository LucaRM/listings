package com.FischbachFoundation.listing.race.Subrace;

import com.FischbachFoundation.listing.race.Race;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table

public class Subrace extends Race{
	public Subrace() {
	}

	public Subrace(Long id, String name, Integer abilityScoreIncrease, Integer age, String size, Integer speed, String darkvision, String[] languages, String type) {
		super( id, name, abilityScoreIncrease, age, size, speed, darkvision, languages);
	}

	public Subrace(String name, Integer abilityScoreIncrease, Integer age, String size, Integer speed, String darkvision, String[] languages, String type) {
		super( name, abilityScoreIncrease, age, size, speed, darkvision, languages);
	}

}