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

import quadribolapi.domain.Jogador;
import quadribolapi.repository.JogadorRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/jogadores")
public class JogadorController {
	
	@Autowired
	private JogadorRepository jogadorRepository;
	
	@GetMapping
	public List<Jogador> getArena() {
		return jogadorRepository.findAll();
	}
	
	@PostMapping
	public Jogador createEquipe(@RequestBody Jogador jogador) {
		return jogadorRepository.save(jogador);
	}
	
}
