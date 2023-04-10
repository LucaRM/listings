package com.FischbachFoundation.listing.player;

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
@RequestMapping(path = "api/v1/player")

public class PlayerController {

	private final PlayerService playerService;

	@Autowired
	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}

	@GetMapping
	public List<Player> getPlayer() {
		return playerService.getPlayer();
	}

	@PostMapping
	public void registerNewPlayer(@RequestBody Player student) {
		playerService.addNewPlayer(student);
	}

	@DeleteMapping(path = "{studentID}")
	public void deleteStudent(@PathVariable("studentID") Long id) {
		playerService.deletePlayer(id);
	}
}
