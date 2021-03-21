import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UsuarioTest {

	@Test
	void testUsuarioInitId() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		assertEquals("id incorreto", joao.getIdUsuario(), 0);
	}
	
	@Test
	void testUsuarioInitNome() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		assertEquals("nome incorreto", joao.getNomeUsuario(), "Joao");
	}
	
	@Test
	void testUsuarioInitEmail() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		assertEquals("email incorreto", joao.getEmail(), "joao@exemplo.com");
	}
	
	@Test
	void testUsuarioInitSenha() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		assertEquals("senha incorreta", joao.getSenha(), "senha123");
	}
	
	@Test
	void testUsuarioInitLogado() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		assertEquals("logado incorreto", joao.getLogado(), false);
	}
	
	@Test
	void testUsuarioSetNome() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.setNomeUsuario("Jose");
		
		assertEquals("novo nome incorreto", joao.getNomeUsuario(), "Jose");
	}
	
	@Test
	void testUsuarioSetEmail() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.setEmail("jose@exemplo.com");
		
		assertEquals("novo email incorreto", joao.getEmail(), "jose@exemplo.com");
	}
	
	@Test
	void testUsuarioTrocaLogado1() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.trocaLogado();
		
		assertTrue("nao trocou logado", joao.getLogado());
	}
	
	@Test
	void testUsuarioTrocaLogado2() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.trocaLogado();
		joao.trocaLogado();
		
		assertEquals("nao trocou logado", joao.getLogado(), false);
	}
	
	@Test
	void testUsuarioLogout() {
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		
		joao.trocaLogado();
		joao.logout();
		
		assertEquals("nao trocou logado", joao.getLogado(), false);
	}

}
