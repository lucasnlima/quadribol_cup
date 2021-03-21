import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransporteTest {

	@Test
	void testTransporteInitId() {
		Transporte onibus = new Transporte("Onibus", "Rua A");
		
		assertEquals("id incorreto", onibus.getIdTransporte(), 0);
	}
	
	@Test
	void testTransporteInitTipo() {
		Transporte onibus = new Transporte("Onibus", "Rua A");
		
		assertEquals("tipo incorreto", onibus.getTipoTransporte(), "Onibus");
	}
	
	@Test
	void testTransporteInitEndereco() {
		Transporte onibus = new Transporte("Onibus", "Rua A");
		
		assertEquals("endereco incorreto", onibus.getEnderecoTransporte(), "Rua A");
	}
	
	@Test
	void testTransporteSetEndereco() {
		Transporte onibus = new Transporte("Onibus", "Rua A");
		
		onibus.setEnderecoTransporte("Rua B");
		
		assertEquals("novo endereco incorreto", onibus.getEnderecoTransporte(), "Rua B");
	}

}
