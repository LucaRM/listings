package com.FischbachFoundation.listing.race;

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
@RequestMapping(path = "api/v1/race")

public class RaceController {

	private final RaceService raceService;

	@Autowired
	public RaceController(RaceService raceService) {
		this.raceService = raceService;
	}

	@GetMapping
	public List<Race> getRace() {
		return raceService.getRace();
	}

	@PostMapping
	public void registerNewRace(@RequestBody Race race) {
		raceService.addNewRace(race);
	}

	@DeleteMapping(path = "{raceID}")
	public void deleteRace(@PathVariable("raceID") Long id) {
		raceService.deleteRace(id);
	}
}
