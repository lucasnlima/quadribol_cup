package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Fase;


class FaseUnitTest {

	@Test
	void testIncluirFase() {
		
		//Quando
		List<Time> participantes = new ArrayList<Time>();
		participantes.add(new Time('Brasil'));
		participantes.add(new Time('Argentina'));
		participantes.add(new Time('França'));
		participantes.add(new Time('Inglaterra'));

		Fase faseTeste = new Fase("Semis", 4);

		//Ação
		faseTeste.setParticipantes(participantes);
		faseTeste.sortear();
		int numeroParticipantes = faseTeste.getNumeroParticipantes();
		String nomeFase = faseTeste.getNome();
		int numeroJogos = faseTeste.numeroJogos();
		
		//Verificação
		assertEquals(4, numeroParticipantes);
		assertEquals(numeroParticipantes/2, numeroJogos);
		assertEquals("Semis", nomeFase);
	}
	
	@Test
	void testAlterarFase() {
		//Quando
        Fase faseTeste = new Fase("Finais", 2);
		faseTeste.addParticipante(new Time('Brasil'));
		faseTeste.addParticipante(new Time('Argentina'));
		faseTeste.sortear();
		
		//Ação
        faseTeste.setNomeFase("Semis");
		faseTeste.addParticipante(new Time('Itália'));
		faseTeste.addParticipante(new Time('Rússia'));
		faseTeste.sortear();
		int numeroParticipantesAlterado = faseTeste.getNumeroParticipantes();
		String nomeFaseAlterado = faseTeste.getNome();
		int numeroJogos = faseTeste.numeroJogos();
		
		//Verificação
		assertEquals(4, numeroParticipantesAlterado);
		assertEquals(numeroParticipantesAlterado/2, numeroJogos);
		assertEquals("Semis", nomeFaseAlterado);
	}

	void DefinirFase() {
		//Quando
        Fase faseTeste = new Fase("Finais", 2);
		Time timeA = new Time("Brasil");
		Time timeB = new Time("Argentina");
		faseTeste.addParticipante(timeA);
		faseTeste.addParticipante(timeB);
		faseTeste.sortear();
		
		//Ação
        List<Jogo> jogos = faseTeste.getJogos();
		for (Jogo jogo : jogos) {
			jogo.marcarPonto("Brasil");
		}
		Time melhorTime = faseTeste.melhorTime();
		
		//Verificação
		assertEquals(timeA, melhorTime);
	}

}
