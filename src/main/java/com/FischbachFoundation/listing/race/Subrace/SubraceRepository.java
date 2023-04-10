package com.FischbachFoundation.listing.race.Subrace;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SubraceRepository extends JpaRepository<Subrace, Long> {
	// SELECT * FROM subrace WHERE email = ?
	@Query("SELECT s FROM Subrace s WHERE s.email = ?1")
    Optional findSubraceByName(String name);

}
