package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Jogador;
import quadribolapi.domain.Jogo;
import quadribolapi.domain.Acomodacao;
import quadribolapi.domain.Arbitro;
import quadribolapi.domain.Arena;
import quadribolapi.domain.Time;

class JogoUnitTest {

	@Test
	void testCriarJogo() {
		//Quando
		Jogador jogA = new Jogador("Ronaldinho Potter", 13, "Apanhador", 20);
		List<Jogador> elencoA =  new ArrayList<Jogador>();
		elencoA.add(jogA);
		Time grifinoria = new Time("Grifinoria");
		grifinoria.setElenco(elencoA);
		
		Jogador jogB = new Jogador("Neville das Plantas", 18, "Zagueiro", 20);
		List<Jogador> elencoB =  new ArrayList<Jogador>();
		elencoB.add(jogB);
		Time corvinal = new Time("Corvinal");
		corvinal.setElenco(elencoB);
		
		Arbitro arb = new Arbitro("Snape", 38);
		
		Acomodacao aco = new Acomodacao("Hogsmeade", "Rua dos Alfeneiros, 19");
		List<Acomodacao> acomodacoes =  new ArrayList<Acomodacao>();
		acomodacoes.add(aco);
		Arena hogwarts = new Arena("Hogwarts", 150000, "Rua dos Alfeneiros, 4");
		hogwarts.setAcomodacoes(acomodacoes);
		
		Jogo grifinoriaVsCorvinal = new Jogo("25/08/1993", hogwarts, grifinoria, corvinal, 0, 0, arb);
		System.out.printf("\nTeste Unitário Jogo - Antes das Modificações:");
		grifinoriaVsCorvinal.exibirInfoJogo();
		
		//Ação
		Jogador jogC = new Jogador("Cristiano Wesley", 8, "Atacante", 30);
		List<Jogador> elencoC =  new ArrayList<Jogador>();
		elencoA.add(jogC);
		Time lufalufa = new Time("Lufa-Lufa");
		lufalufa.setElenco(elencoC);
		
		Jogador jogD = new Jogador("Dino Secundário", 20, "Zagueiro", 30);
		List<Jogador> elencoD =  new ArrayList<Jogador>();
		elencoD.add(jogD);
		Time sonserina = new Time("Sonserina");
		sonserina.setElenco(elencoD);
		
		Arbitro arb2 = new Arbitro("Dumbledore", 154);
		
		Acomodacao aco2 = new Acomodacao("Casa do Potter", "Rua dos Alfeneiros, 6");
		List<Acomodacao> acomodacoes2 =  new ArrayList<Acomodacao>();
		acomodacoes2.add(aco2);
		Arena londres = new Arena("Londres", 170000, "Rua dos Alfeneiros, 5");
		londres.setAcomodacoes(acomodacoes2);
		
		String data2 = "26/09/1994";
		grifinoriaVsCorvinal.setData(data2);
		grifinoriaVsCorvinal.setArbitro(arb2);
		grifinoriaVsCorvinal.setTimeA(lufalufa);
		grifinoriaVsCorvinal.setTimeB(sonserina);
		grifinoriaVsCorvinal.setLocal(londres);
		grifinoriaVsCorvinal.setPontosA(7);
		grifinoriaVsCorvinal.setPontosB(1);
		System.out.printf("\nTeste Unitário Jogo - Depois das Modificações:");
		grifinoriaVsCorvinal.exibirInfoJogo();
		
		//Verificação
		assertEquals(grifinoriaVsCorvinal.getData(), data2);
		assertEquals(grifinoriaVsCorvinal.getArbitro().getNomeArbitro(), "Dumbledore");
		assertEquals(grifinoriaVsCorvinal.getTimeA().getNomeTime(), "Lufa-Lufa");
		assertEquals(grifinoriaVsCorvinal.getTimeB().getNomeTime(), "Sonserina");
		assertEquals(grifinoriaVsCorvinal.getLocal().getNomeArena(), "Londres");
		assertEquals(grifinoriaVsCorvinal.getPontosA(), 7);
		assertEquals(grifinoriaVsCorvinal.getPontosB(), 1);
		
	}
	
	@Test
	void marcarPontos() {
		//Quando
		Jogador jogA = new Jogador("Ronaldinho Potter", 13, "Apanhador", 20);
		List<Jogador> elencoA =  new ArrayList<Jogador>();
		elencoA.add(jogA);
		Time grifinoria = new Time("Grifinoria");
		grifinoria.setElenco(elencoA);
		
		Jogador jogB = new Jogador("Neville das Plantas", 18, "Zagueiro", 20);
		List<Jogador> elencoB =  new ArrayList<Jogador>();
		elencoB.add(jogB);
		Time corvinal = new Time("Corvinal");
		corvinal.setElenco(elencoB);
		
		Arbitro arb = new Arbitro("Snape", 38);
		
		Acomodacao aco = new Acomodacao("Hogsmeade", "Rua dos Alfeneiros, 19");
		List<Acomodacao> acomodacoes =  new ArrayList<Acomodacao>();
		acomodacoes.add(aco);
		Arena hogwarts = new Arena("Hogwarts", 150000, "Rua dos Alfeneiros, 4");
		hogwarts.setAcomodacoes(acomodacoes);
		
		Jogo grifinoriaVsCorvinal = new Jogo("25/08/1993", hogwarts, grifinoria, corvinal, 0, 0, arb);
		System.out.printf("\nTeste Unitário Jogo - Antes das Modificações:");
		grifinoriaVsCorvinal.exibirInfoJogo();
		
		//Ação
		grifinoriaVsCorvinal.marcarPonto("Grifinoria");
		grifinoriaVsCorvinal.marcarPonto("Grifinoria");
		grifinoriaVsCorvinal.marcarPonto("Corvinal");
		System.out.printf("\nMarcando pontos para time inválido:");
		grifinoriaVsCorvinal.marcarPonto("Sonserina");
		System.out.printf("\nTeste Unitário Jogo - Depois das Modificações:");
		grifinoriaVsCorvinal.exibirInfoJogo();
		
		//Verificação
		assertEquals(grifinoriaVsCorvinal.getPontosA(), 2);
		assertEquals(grifinoriaVsCorvinal.getPontosB(), 1);
		
	}

}
