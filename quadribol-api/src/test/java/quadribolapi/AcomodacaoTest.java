package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Acomodacao;

class AcomodacaoTest {
	
	@Test
	void testAcomodacaoInitNome() {
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		
		assertEquals(hotel.getNome(), "Hotel");
	}
	
	@Test
	void testAcomodacaoInitEndereco() {
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		
		assertEquals(hotel.getEndereco(), "Rua A");
	}
	
	@Test
	void testAcomodacaoSetNome() {
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		
		hotel.setNome("Pousada");
		
		assertEquals(hotel.getNome(), "Pousada");
	}

}
