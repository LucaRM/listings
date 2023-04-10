package com.FischbachFoundation.listing.race;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RaceConfig {
	@Bean
	CommandLineRunner commandLineRunnerRace(RaceRepository repository) {
		return args -> {
			Race elf = new Race(
				"Elf",
				2,
				750,
				"Medium",
				30,
				"60 feet",
				new String[] {"Common", "Elvish"}
			);

			Race dwarf = new Race(
				"dwarf", 
				2,
				350,
				"Medium",
				25,
				"60 feet",
				new String[] {"Common", "Dwarvish"}
			);

			repository.saveAll(
				List.of(elf)
			);
		};
	}
}
