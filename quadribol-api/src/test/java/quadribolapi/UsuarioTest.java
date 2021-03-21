package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Usuario;

public class UsuarioTest {
	
	@Test
	void testUsuarioInitNome() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		assertEquals(joao.getNomeUsuario(), "Joao");
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
		
		assertEquals(joao.getLogado(), false);
	}
	
	@Test
	void testUsuarioSetNome() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.setNomeUsuario("Jose");
		
		assertEquals(joao.getNomeUsuario(), "Jose");
	}
	
	@Test
	void testUsuarioSetEmail() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.setEmail("jose@exemplo.com");
		
		assertEquals(joao.getEmail(), "jose@exemplo.com");
	}
	
	@Test
	void testUsuarioTrocaLogado1() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.trocaLogado();
		
		assertTrue(joao.getLogado());
	}
	
	@Test
	void testUsuarioTrocaLogado2() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.trocaLogado();
		joao.trocaLogado();
		
		assertEquals(joao.getLogado(), false);
	}
	
	@Test
	void testUsuarioLogout() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.trocaLogado();
		joao.logout();
		
		assertEquals(joao.getLogado(), false);
	}

}
