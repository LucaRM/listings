package com.FischbachFoundation.listing.race.Subrace;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubraceService {
	private final SubraceRepository subraceRepository;

	@Autowired
	public SubraceService(SubraceRepository subraceRepository) {
		this.subraceRepository = subraceRepository;
	}

	public List<Subrace> getPlayer() {
		return subraceRepository.findAll();
	}
}