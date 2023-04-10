package com.FischbachFoundation.listing.player;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	private final PlayerRepository playerRepository;

	@Autowired
	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	public List<Player> getPlayer() {
		return playerRepository.findAll();
	}

	public void addNewPlayer(Player player) {
		Optional<Player> playerOptional = playerRepository
			.findPlayerByEmail(player.getEmail());
			if (playerOptional.isPresent()) {
				throw new IllegalStateException("email taken");
			}
			playerRepository.save(player);

	}

	public void deletePlayer(Long id) {
		boolean exists = playerRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException(
				"player with id " + id + " does not exist"
			);
		}
		playerRepository.deleteById(id);
	}
}