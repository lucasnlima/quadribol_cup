package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Jogador;
import quadribolapi.domain.Placar;
import quadribolapi.domain.Arbitro;
import quadribolapi.domain.Equipe;

class PlacarUnitTest {

	@Test
	void testCriarPlacar() {

		//Quando
		Placar plac = new Placar(0, 0, "Jogo doido.");
		int golsA = 7;
		int golsB = 1;
		String estat = "Jogo triste.";
		System.out.printf("\nTeste Unitário Placar - Antes das Modificações:");
		plac.exibirPlacar();
		
		//Ação
		plac.setGolsParticipanteA(golsA);
		plac.setGolsParticipanteB(golsB);
		plac.setEstatisticas(estat);
		System.out.printf("\nTeste Unitário Placar - Depois das Modificações:");
		plac.exibirPlacar();
		
		//Verificação
		assertEquals(plac.getGolsParticipanteA(), golsA);
		assertEquals(plac.getGolsParticipanteB(), golsB);
		assertEquals(plac.getEstatisticas(), estat);
		
	}
	
	@Test
	void testMarcarGols() {
		//Quando
		Placar plac = new Placar(0, 0, "");
		System.out.printf("\nTeste Unitário Placar 2 - Antes das Modificações:");
		plac.exibirPlacar();
		
		//Ação
		plac.marcaGolA();
		plac.marcaGolA();
		plac.marcaGolB();
		System.out.printf("\nTeste Unitário Placar 2 - Depois das Modificações:");
		plac.exibirPlacar();
		
		//Verificação
		assertEquals(plac.getGolsParticipanteA(), 2);
		assertEquals(plac.getGolsParticipanteB(), 1);
		
	}

}
