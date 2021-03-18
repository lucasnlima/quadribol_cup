package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Fase;


class FaseUnitTest {

	@Test
	void testIncluirFase() {
		
		//Quando
        Fase faseTeste = new Fase(1,"Finais", 2);
	
		//Ação
		int numeroParticipantes = faseTeste.getNumeroParticipantes();
		String nomeFase = faseTeste.getNome();
		Long id = faseTeste.getId();
		
		//Verificação
		assertEquals(2, numeroParticipantes);
		assertEquals(1, id);
		assertEquals("Finais", nomeFase);
	}
	
	@Test
	void testAlterarFase() {
		//Quando
		Fase faseTeste = new Fase(2,"Semifinais", 4);
		
		//Ação
        faseTeste.alterarFase("Quartas", 8);
		int numeroParticipantesAlterado = faseTeste.getNumeroParticipantes();
		String nomeFaseAlterado = faseTeste.getNome();
		
		//Verificação
		assertEquals(4, numeroParticipantesAlterado);
		assertEquals("Quartas", nomeFaseAlterado);
	}

}
