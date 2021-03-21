import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdministradorTest {

	@Test
	void testAdministradorInitRanking() {
		Administrador joao = new Administrador("Joao", "joao@exemplo.com", "senha123", 1);
		
		assertEquals("ranking incorreto", joao.getRanking(), 1);
	}
	
	@Test
	void testAdministradorSetRanking() {
		Administrador joao = new Administrador("Joao", "joao@exemplo.com", "senha123", 1);
		
		joao.setRanking(2);
		
		assertEquals("novo ranking incorreto", joao.getRanking(), 2);
	}
	
	@Test
	void testAdministradorPromover() {
		Administrador joao = new Administrador("Joao", "joao@exemplo.com", "senha123", 1);
		
		joao.promover();
		
		assertEquals("novo ranking incorreto", joao.getRanking(), 2);
	}

}
