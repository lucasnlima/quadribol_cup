import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcomodacaoTest {

	@Test
	void testAcomodacaoInitId() {
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		
		assertEquals("id incorreto", hotel.getIdAcomodacao(), 0);
	}
	
	@Test
	void testAcomodacaoInitNome() {
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		
		assertEquals("nome incorreto", hotel.getNomeAcomodacao(), "Hotel");
	}
	
	@Test
	void testAcomodacaoInitEndereco() {
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		
		assertEquals("endereco incorreto", hotel.getEndereco(), "Rua A");
	}
	
	@Test
	void testAcomodacaoSetNome() {
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		
		hotel.setNomeAcomodacao("Pousada");
		
		assertEquals("novo nome incorreto", hotel.getNomeAcomodacao(), "Pousada");
	}

}
