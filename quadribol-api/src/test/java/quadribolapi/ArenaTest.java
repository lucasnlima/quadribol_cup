package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Acomodacao;
import quadribolapi.domain.Arena;
import quadribolapi.domain.Transporte;

class ArenaTest {
	
	@Test
	void testArenaInitNome() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertEquals(pista.getNomeArena(), "Pista");
	}
	
	@Test
	void testArenaInitCapacidade() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertEquals(pista.getCapacidade(), 500);
	}
	
	@Test
	void testArenaInitEndereco() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertEquals(pista.getEndereco(), "Rua ABC");
	}
	
	@Test
	void testArenaInitAcomodacoes() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertTrue(pista.getAcomodacoes().isEmpty());
	}
	
	@Test
	void testArenaInitTransportes() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		assertTrue(pista.getTransportes().isEmpty());
	}
	
	@Test
	void testArenaSetNome() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		pista.setNomeArena("Arena");
		
		assertEquals(pista.getNomeArena(), "Arena");
	}
	
	@Test
	void testArenaSetCapacidade() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		pista.setCapacidade(300);
		
		assertEquals(pista.getCapacidade(), 300);
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
		
		assertEquals(pista.getAcomodacoes().size(), 2);
	}
	
	@Test
	void testArenaAddAcomodacao() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		pista.addAcomodacao(hotel);
		
		assertEquals(pista.getAcomodacoes().size(), 1);
	}
	
	@Test
	void testArenaRemoveAcomodacao() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Acomodacao hotel = new Acomodacao("Hotel", "Rua A");
		pista.addAcomodacao(hotel);
		pista.removeAcomodacao(hotel);
		
		assertTrue(pista.getAcomodacoes().isEmpty());
	}
	
	@Test
	void testArenaSetTransportes() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Transporte onibus = new Transporte("Onibus", "Rua A");
		List<Transporte> lista = new ArrayList<Transporte>();
		lista.add(onibus);
		pista.setTransportes(lista);
		
		assertEquals(pista.getTransportes().size(), 1);
	}
	
	@Test
	void testArenaAddTransporte() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Transporte onibus = new Transporte("Onibus", "Rua A");
		pista.addTransporte(onibus);
		
		assertEquals(pista.getTransportes().size(), 1);
	}
	
	@Test
	void testArenaRemoveTransporte() {
		Arena pista = new Arena("Pista", 500, "Rua ABC");
		
		Transporte onibus = new Transporte("Onibus", "Rua A");
		pista.addTransporte(onibus);
		pista.removeTransporte(onibus);
		
		assertTrue(pista.getTransportes().isEmpty());
	}

}
