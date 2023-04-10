package com.FischbachFoundation.listing.person;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.FischbachFoundation.listing.player.Player;
import com.FischbachFoundation.listing.race.RaceRepository;
import com.FischbachFoundation.listing.student.Student;

@Configuration
public class PersonConfig {
	@Bean
	CommandLineRunner commandLineRunnerPerson(RaceRepository repository) {
		return args -> {
			Student mariam = new Student(
				"Mariam",
				"mariam.jamal@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5),
				"student"
			);

			Student alex = new Student(
				"Alex",
				"alex@gmail.com",
				LocalDate.of(2004, Month.JANUARY, 5),
				"student"
			);

			Player luca = new Player(
				"Luca",
				"luca@gmail.com",
				LocalDate.of(1997, Month.MAY, 10),
				"player"
			);

			repository.saveAll(
				List.of(mariam, alex, luca)
			);
		};
	}
}
