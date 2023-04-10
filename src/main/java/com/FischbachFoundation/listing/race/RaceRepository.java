package com.FischbachFoundation.listing.race;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {
	@Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional findRaceByEmail(String email);
}
