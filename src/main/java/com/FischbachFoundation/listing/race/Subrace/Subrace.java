package com.FischbachFoundation.listing.race.Subrace;

import com.FischbachFoundation.listing.race.Race;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table

public class Subrace extends Race{
	private Integer additionalAbilityScoreIncrease;

	public Subrace() {
	}

	public Subrace(Long id, String name, Integer abilityScoreIncrease, Integer age, String size, Integer speed, String darkvision, String[] languages, Integer additionalAbilityScoreIncrease) {
		super( id, name, abilityScoreIncrease, age, size, speed, darkvision, languages);
		this.additionalAbilityScoreIncrease = additionalAbilityScoreIncrease;
	}

	public Subrace(String name, Integer abilityScoreIncrease, Integer age, String size, Integer speed, String darkvision, String[] languages, Integer additionalAbilityScoreIncrease) {
		super( name, abilityScoreIncrease, age, size, speed, darkvision, languages);
		this.additionalAbilityScoreIncrease = additionalAbilityScoreIncrease;
	}

}