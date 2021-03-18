package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Jogador;
import quadribolapi.domain.Jogo;
import quadribolapi.domain.Placar;
import quadribolapi.domain.PracaEsportiva;
import quadribolapi.domain.Arbitro;
import quadribolapi.domain.Equipe;

class JogoUnitTest {

	@Test
	void testCriarJogo() {
		
		//Quando
		Placar plac = new Placar(0, 0, "Não aconteceu ainda.");
		
		Jogador jogA = new Jogador(1, "Ronaldinho Potter", 13, "Apanhador");
		List<Jogador> elencoA =  new ArrayList<Jogador>();
		elencoA.add(jogA);
		Equipe grifinoria = new Equipe(1, "Grifinoria", elencoA);
		
		Jogador jogB = new Jogador(1, "Neville das Plantas", 18, "Zagueiro");
		List<Jogador> elencoB =  new ArrayList<Jogador>();
		elencoB.add(jogB);
		Equipe corvinal = new Equipe(1, "Corvinal", elencoB);
		
		Arbitro arb = new Arbitro(1, "Snape", 38);
		
		List<String> acomodacoes =  new ArrayList<String>();
		acomodacoes.add("Hogsmeade");
		PracaEsportiva hogwarts = new PracaEsportiva(1, "Hogwarts", 150000, "Rua dos Alfeneiros, 4", acomodacoes);
		
		Jogo grifinoriaVsCorvinal = new Jogo(1, "25/08/1993", plac, grifinoria, corvinal, arb, hogwarts);
		System.out.printf("\nTeste Unitário Jogo - Antes das Modificações:");
		grifinoriaVsCorvinal.exibirInfoJogo();
		
		//Ação
		Placar plac2 = new Placar(7, 1, "Foi triste.");
		
		Jogador jogC = new Jogador(1, "Cristiano Wesley", 8, "Atacante");
		List<Jogador> elencoC =  new ArrayList<Jogador>();
		elencoA.add(jogC);
		Equipe lufalufa = new Equipe(1, "Lufa-Lufa", elencoC);
		
		Jogador jogD = new Jogador(1, "Dino Secundário", 18, "Zagueiro");
		List<Jogador> elencoD =  new ArrayList<Jogador>();
		elencoB.add(jogD);
		Equipe sonserina = new Equipe(1, "Sonserina", elencoD);
		
		Arbitro arb2 = new Arbitro(1, "Dumbledore", 154);
		
		List<String> acomodacoes2 =  new ArrayList<String>();
		acomodacoes2.add("Casa do Potter");
		PracaEsportiva londres = new PracaEsportiva(1, "Londres", 150000, "Rua dos Alfeneiros, 5", acomodacoes2);
		
		String data2 = "26/09/1994";
		grifinoriaVsCorvinal.setData(data2);
		grifinoriaVsCorvinal.setArbitro(arb2);
		grifinoriaVsCorvinal.setPlacar(plac2);
		grifinoriaVsCorvinal.setParticipanteA(lufalufa);
		grifinoriaVsCorvinal.setParticipanteB(sonserina);
		grifinoriaVsCorvinal.setPracaEsportiva(londres);
		System.out.printf("\nTeste Unitário Jogo - Depois das Modificações:");
		grifinoriaVsCorvinal.exibirInfoJogo();
		
		//Verificação
		assertEquals(grifinoriaVsCorvinal.getData(), data2);
		assertEquals(grifinoriaVsCorvinal.getArbitro().getNome(), "Dumbledore");
		assertEquals(grifinoriaVsCorvinal.getPlacar().getGolsParticipanteA(), 7);
		assertEquals(grifinoriaVsCorvinal.getParticipanteA().getNome(), "Lufa-Lufa");
		assertEquals(grifinoriaVsCorvinal.getParticipanteB().getNome(), "Sonserina");
		assertEquals(grifinoriaVsCorvinal.getPracaEsportiva().getNome(), "Londres");
		
	}

}
