package com.FischbachFoundation.listing.person;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	// SELECT * FROM student WHERE email = ?
	@Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional findPersonByEmail(String email);

}
