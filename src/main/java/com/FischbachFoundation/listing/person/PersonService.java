package com.FischbachFoundation.listing.person;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FischbachFoundation.listing.race.RaceRepository;

@Service
public class PersonService {
	private final RaceRepository personRepository;

	@Autowired
	public PersonService(RaceRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<Person> getPerson() {
		return personRepository.findAll();
	}

	public void addNewPerson(Person person) {
		Optional<Person> personOptional = personRepository
			.findPersonByEmail(person.getEmail());
			if (personOptional.isPresent()) {
				throw new IllegalStateException("Email Already Registered");
			}
			if (person.getDateOfBirth().isAfter(LocalDate.now())) {
				throw new IllegalStateException("Date of birth must be in the past");
			}
			if (person.getDateOfBirth().isAfter(LocalDate.now().minusYears(18))) {
				throw new IllegalStateException("You must be at least 18 years old to register");
			}
			if (!person.getType().equalsIgnoreCase("player") && !person.getType().equalsIgnoreCase("student")) {
				throw new IllegalStateException("type must be either 'player' or 'student'");
			}
			person.setType(person.getType().toLowerCase());
			personRepository.save(person);

	}

	public void deletePerson(Long id) {
		boolean exists = personRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException(
				"person with id " + id + " does not exist"
			);
		}
		personRepository.deleteById(id);
	}
}