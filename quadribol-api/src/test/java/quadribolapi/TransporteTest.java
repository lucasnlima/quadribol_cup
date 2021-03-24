package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Transporte;

class TransporteTest {
	
	@Test
	void testTransporteInitTipo() {
		Transporte onibus = new Transporte("Onibus", "Rua A");
		
		assertEquals(onibus.getTipoTransporte(), "Onibus");
	}
	
	@Test
	void testTransporteInitEndereco() {
		Transporte onibus = new Transporte("Onibus", "Rua A");
		
		assertEquals(onibus.getEnderecoTransporte(), "Rua A");
	}
	
	@Test
	void testTransporteSetEndereco() {
		Transporte onibus = new Transporte("Onibus", "Rua A");
		
		onibus.setEnderecoTransporte("Rua B");
		
		assertEquals(onibus.getEnderecoTransporte(), "Rua B");
	}

}
