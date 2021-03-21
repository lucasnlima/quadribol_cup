import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;

import org.junit.jupiter.api.Test;

class ArenaTest {

	@Test
	void testArenaInitId() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertEquals("id incorreto", pista.getIdArena(), 0);
	}
	
	@Test
	void testArenaInitNome() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertEquals("nome incorreto", pista.getNomeArena(), "Pista");
	}
	
	@Test
	void testArenaInitCapacidade() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertEquals("capacidade incorreta", pista.getCapacidade(), 500);
	}
	
	@Test
	void testArenaInitEndereco() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertEquals("endereco incorreto", pista.getEndereco(), "Rua ABC");
	}
	
	@Test
	void testArenaInitAcomodacoes() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertTrue("acomodacoes incorreto", pista.getAcomodacoes().isEmpty());
	}
	
	@Test
	void testArenaInitTransportes() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertTrue("transportes incorreto", pista.getTransportes().isEmpty());
	}
	
	@Test
	void testArenaSetNome() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		pista.setNomeArena("Arena");
		
		assertEquals("novo nome incorreto", pista.getNomeArena(), "Arena");
	}
	
	@Test
	void testArenaSetCapacidade() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		pista.setCapacidade(300);
		
		assertEquals("capacidade incorreta", pista.getCapacidade(), 300);
	}
	
	@Test
	void testArenaSetAcomodacoes() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		Acomodacao pousada = new Acomodacao("Pousada", "Rua B");
		List<Acomodacao> lista = new ArrayList<Acomodacao>();
		lista.add(hotel);
		lista.add(pousada);
		pista.setAcomodacoes(lista);
		
		assertEquals("novo acomodacoes incorreto", pista.getAcomodacoes().lenght, 2);
	}
	
	@Test
	void testArenaAddAcomodacao() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		pista.addAcomodacao(hotel);
		
		assertEquals("add acomodacao incorreto", pista.getAcomodacoes().lenght, 1);
	}
	
	@Test
	void testArenaRemoveAcomodacao() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		pista.addAcomodacao(hotel);
		pista.removeAcomodacao(hotel);
		
		assertTrue("remove acomodacao incorreto", pista.getAcomodacoes().isEmpty());
	}
	
	@Test
	void testArenaSetTransportes() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Transporte onibus = new Transporte("Onibus", "Rua A");
		List<Transporte> lista = new ArrayList<Transporte>();
		lista.add(onibus);
		pista.setTransportes(lista);
		
		assertEquals("novo transportes incorreto", pista.getTransportes().lenght, 1);
	}
	
	@Test
	void testArenaAddTransporte() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Transporte onibus = new Transporte("Onibus", "Rua A");
		pista.addTransporte(onibus);
		
		assertEquals("add transporte incorreto", pista.getTransportes().lenght, 1);
	}
	
	@Test
	void testArenaRemoveTransporte() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Transporte onibus = new Transporte("Onibus", "Rua A");
		pista.addTransporte(onibus);
		pista.removeTransporte(onibus);
		
		assertTrue("remove transporte incorreto", pista.getTransportes().isEmpty());
	}

}
