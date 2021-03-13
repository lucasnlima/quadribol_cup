package quadribolapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quadribolapi.domain.Usuario;
import quadribolapi.repository.UsuarioRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UsuarioRepository userRepoitory;
	
	@GetMapping
	public List<Usuario> getUsers() {
		return userRepoitory.findAll();
	}
	
	@PostMapping
	public Usuario createUser(@RequestBody Usuario user) {
		return userRepoitory.save(user);
	}
	
}
