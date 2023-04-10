package com.FischbachFoundation.listing.player;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
	// SELECT * FROM player WHERE email = ?
	@Query("SELECT s FROM Player s WHERE s.email = ?1")
    Optional findPlayerByEmail(String email);

}
