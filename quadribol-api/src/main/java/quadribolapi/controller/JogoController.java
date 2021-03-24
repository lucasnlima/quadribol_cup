package quadribolapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quadribolapi.domain.Jogo;
import quadribolapi.repository.JogoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
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
	
	@PutMapping("/{jogo_id}/golA")
	public Jogo maracarPontoA(@PathVariable long jogo_id) {
		Jogo jogo = jogoRepository.getOne(jogo_id);
		jogo.marcarPonto(null);
		jogoRepository.save(jogo);
		return jogoRepository.save(jogo);
	}
	
	@PutMapping("/{jogo_id}/golB")
	public Jogo maracarPontoB(@PathVariable long jogo_id) {
		Jogo jogo = jogoRepository.getOne(jogo_id);
		jogo.marcarPonto(null);
		jogoRepository.save(jogo);
		return jogoRepository.save(jogo);
	}
	
}
