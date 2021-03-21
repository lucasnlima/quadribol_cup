import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;

import org.junit.jupiter.api.Test;

class GerenciadorUsuariosTest {
	
	@Test
	void testGerenciadorUsuariosInitUsuarios() {
		GerenciadorUsuarios mestre = new GerenciadorUsuarios();
		
		assertTrue("usuarios incorreto", mestre.getUsuarios().isEmpty());
	}
	
	@Test
	void testGerenciadorUsuariosSetUsuarios() {
		GerenciadorUsuarios mestre = new GerenciadorUsuarios();
		
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		List<Usuario> lista = new ArrayList<Usuario>();
		lista.add(joao);
		mestre.setUsuarios(lista);
		
		assertEquals("novo acomodacoes incorreto", mestre.getUsuarios().lenght, 1);
	}
	
	@Test
	void testGerenciadorUsuariosAddUsuario() {
		GerenciadorUsuarios mestre = new GerenciadorUsuarios();
		
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		mestre.addUsuario(joao);
		
		assertEquals("add usuario incorreto", mestre.getUsuarios().lenght, 1);
	}
	
	@Test
	void testGerenciadorUsuariosRemoveUsuario() {
		GerenciadorUsuarios mestre = new GerenciadorUsuarios();
		
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		mestre.addUsuario(joao);
		mestre.removeUsuario(joao);
		
		assertTrue("remove usuario incorreto", mestre.getUsuarios().isEmpty());
	}
	
	@Test
	void testGerenciadorUsuariosLogin() {
		GerenciadorUsuarios mestre = new GerenciadorUsuarios();
		
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		mestre.addUsuario(joao);
		
		r = mestre.login("Joao", "senha123");
		assertEquals("sucesso no login nao atingido", r, 1);
		
		r = mestre.login("Joao", "senha123");
		assertEquals("usuario ja logado nao identificado", r, 0);
		
		r = mestre.login("Joao", "senha321");
		assertEquals("senha incorreta nao identificada", r, 2);
		
		r = mestre.login("Lucas", "senha456");
		assertEquals("usuario inexistente nao identificado", r, 3);
	}

}
