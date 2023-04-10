package com.FischbachFoundation.listing.person;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	private final PersonRepository personRepository;

	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<Person> getPerson() {
		return personRepository.findAll();
	}

	public void addNewPerson(Person person) {
		Optional<Person> personOptional = personRepository
			.findPersonByEmail(person.getEmail());
			if (personOptional.isPresent()) {
				throw new IllegalStateException("email taken");
			}
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