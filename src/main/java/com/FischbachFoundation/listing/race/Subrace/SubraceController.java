package com.FischbachFoundation.listing.race.Subrace;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/player")

public class SubraceController {

	private final SubraceService subraceService;

	@Autowired
	public SubraceController(SubraceService subraceService) {
		this.subraceService = subraceService;
	}

	@GetMapping
	public List<Subrace> getPlayer() {
		return subraceService.getPlayer();
	}
}
