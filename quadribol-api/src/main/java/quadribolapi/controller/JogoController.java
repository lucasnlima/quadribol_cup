package quadribolapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quadribolapi.domain.Jogo;
import quadribolapi.repository.JogoRepository;

@RestController
@RequestMapping("/jogos")
public class JogoController {
	
	@Autowired
	private JogoRepository jogoRepository;
	
	@GetMapping
	public List<Jogo> getJogos() {
		return jogoRepository.findAll();
	}
	
	@PostMapping
	public Jogo createJogo(@RequestBody Jogo jogo) {
		return jogoRepository.save(jogo);
	}
	
}
