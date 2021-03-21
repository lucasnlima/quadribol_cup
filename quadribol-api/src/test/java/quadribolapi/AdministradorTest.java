package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Administrador;

class AdministradorTest {

	@Test
	void testAdministradorInitRanking() {
		Administrador joao = new Administrador("Joao", "joao@exemplo.com", "senha123", 1);
		
		assertEquals(joao.getRanking(), 1);
	}
	
	@Test
	void testAdministradorSetRanking() {
		Administrador joao = new Administrador("Joao", "joao@exemplo.com", "senha123", 1);
		
		joao.setRanking(2);
		
		assertEquals(joao.getRanking(), 2);
	}
	
	@Test
	void testAdministradorPromover() {
		Administrador joao = new Administrador("Joao", "joao@exemplo.com", "senha123", 1);
		
		joao.promover();
		
		assertEquals(joao.getRanking(), 2);
	}

}
