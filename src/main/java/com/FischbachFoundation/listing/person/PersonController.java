package com.FischbachFoundation.listing.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/person")

public class PersonController {

	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping
	public List<Person> getPerson() {
		return personService.getPerson();
	}

	@PostMapping
	public void registerNewPerson(@RequestBody Person person) {
		personService.addNewPerson(person);
	}

	@DeleteMapping(path = "{personID}")
	public void deletePerson(@PathVariable("personID") Long id) {
		personService.deletePerson(id);
	}
}
