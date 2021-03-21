package quadribolapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import quadribolapi.domain.Equipe;
import quadribolapi.repository.EquipeRepository;

@RestController
@RequestMapping("/equipes")
public class EquipeController {
	
	@Autowired
	private EquipeRepository equipeRepository;
	
	@GetMapping
	public List<Equipe> getEquipes() {
		return equipeRepository.findAll();
	}
	
	@GetMapping("/{nome}")
	public Equipe getEquipes(@PathVariable String nome) {
		return equipeRepository.getEquipeByNome(nome);
	}
	
	@PostMapping
	public Equipe createEquipe(@RequestBody Equipe equipe) {
		return equipeRepository.save(equipe);
	}
	
}
