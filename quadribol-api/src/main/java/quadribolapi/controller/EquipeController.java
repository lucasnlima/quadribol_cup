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

import quadribolapi.domain.Time;
import quadribolapi.repository.TimeRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/times")
public class EquipeController {
	
	@Autowired
	private TimeRepository timeRepository;
	
	@GetMapping
	public List<Time> getTime() {
		return timeRepository.findAll();
	}
	
	@GetMapping("/{nome}")
	public Time getEquipes(@PathVariable String nome) {
		return timeRepository.getEquipeByNome(nome);
	}
	
	@PostMapping
	public Time createEquipe(@RequestBody Time time) {
		return timeRepository.save(time);
	}
	
}
