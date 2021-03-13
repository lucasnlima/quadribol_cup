package quadribolapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quadribolapi.domain.User;
import quadribolapi.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepoitory;
	
	@GetMapping
	public List<User> getUsers() {
		return userRepoitory.findAll();
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userRepoitory.save(user);
	}
	
}
