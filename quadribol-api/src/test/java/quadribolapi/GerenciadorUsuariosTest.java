package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.GerenciadorUsuarios;
import quadribolapi.domain.Usuario;

class GerenciadorUsuariosTest {
	
	@Test
	void testGerenciadorUsuariosInitUsuarios() {
		GerenciadorUsuarios mestre = new GerenciadorUsuarios();
		
		assertTrue(mestre.getUsuarios().isEmpty());
	}
	
	@Test
	void testGerenciadorUsuariosSetUsuarios() {
		GerenciadorUsuarios mestre = new GerenciadorUsuarios();
		
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		List<Usuario> lista = new ArrayList<Usuario>();
		lista.add(joao);
		mestre.setUsuarios(lista);
		
		assertEquals(mestre.getUsuarios().size(), 1);
	}
	
	@Test
	void testGerenciadorUsuariosAddUsuario() {
		GerenciadorUsuarios mestre = new GerenciadorUsuarios();
		
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		mestre.addUsuario(joao);
		
		assertEquals(mestre.getUsuarios().size(), 1);
	}
	
	@Test
	void testGerenciadorUsuariosRemoveUsuario() {
		GerenciadorUsuarios mestre = new GerenciadorUsuarios();
		
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		mestre.addUsuario(joao);
		mestre.removeUsuario(joao);
		
		assertTrue(mestre.getUsuarios().isEmpty());
	}
	
	@Test
	void testGerenciadorUsuariosLogin() {
		GerenciadorUsuarios mestre = new GerenciadorUsuarios();
		
		Usuario joao = new Usuario("Joao", "joao@exemplo.com", "senha123");
		mestre.addUsuario(joao);
		
		int r = mestre.login("Joao", "senha123");
		assertEquals(r, 1);
		
		r = mestre.login("Joao", "senha123");
		assertEquals(r, 0);
		
		r = mestre.login("Joao", "senha321");
		assertEquals(r, 2);
		
		r = mestre.login("Lucas", "senha456");
		assertEquals(r, 3);
	}

}
