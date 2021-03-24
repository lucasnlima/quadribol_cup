package quadribolapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quadribolapi.domain.Arena;
import quadribolapi.repository.ArenaRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/arenas")
public class ArenaController {
	
	@Autowired
	private ArenaRepository arenaRepository;
	
	@GetMapping
	public List<Arena> getArena() {
		return arenaRepository.findAll();
	}
	
	@PostMapping
	public Arena createEquipe(@RequestBody Arena arena) {
		return arenaRepository.save(arena);
	}
	
}
