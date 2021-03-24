package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Usuario;

public class UsuarioTest {
	
	@Test
	void testUsuarioInitNome() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		assertEquals(joao.getNome(), "Joao");
	}
	
	@Test
	void testUsuarioInitEmail() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		assertEquals(joao.getEmail(), "joao@exemplo.com");
	}
	
	@Test
	void testUsuarioInitSenha() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		assertEquals(joao.getSenha(), "senha123");
	}
	
	@Test
	void testUsuarioInitLogado() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		assertEquals(joao.auth(), false);
	}
	
	@Test
	void testUsuarioSetNome() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.setNome("Jose");
		
		assertEquals(joao.getNome(), "Jose");
	}
	
	@Test
	void testUsuarioSetEmail() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.setEmail("jose@exemplo.com");
		
		assertEquals(joao.getEmail(), "jose@exemplo.com");
	}
	
	@Test
	void testUsuarioLogin() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.login("senha123");
		
		assertTrue(joao.auth());
	}
	
	@Test
	void testUsuarioSenhaErrada() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.login("erreiAsenha");
		
		assertEquals(joao.auth(), false);
	}
	
	@Test
	void testUsuarioLogout() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.login("senha123");
		joao.logout();
		
		assertEquals(joao.auth(), false);
	}

}
