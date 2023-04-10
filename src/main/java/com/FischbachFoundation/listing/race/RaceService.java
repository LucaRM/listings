package com.FischbachFoundation.listing.race;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceService {
	private final RaceRepository raceRepository;

	@Autowired
	public RaceService(RaceRepository raceRepository) {
		this.raceRepository = raceRepository;
	}

	public List<Race> getRace() {
		return raceRepository.findAll();
	}

	public void addNewRace(Race race) {
		raceRepository.save(race);

	}

	public void deleteRace(Long id) {
		boolean exists = raceRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException(
				"race with id " + id + " does not exist"
			);
		}
		raceRepository.deleteById(id);
	}
}