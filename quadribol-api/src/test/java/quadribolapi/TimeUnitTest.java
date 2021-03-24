package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Jogador;
import quadribolapi.domain.Time;

class TimeUnitTest {

	@Test
	void testAddJogador() {
		//Quando
		Jogador jogA = new Jogador("Ronaldinho Potter",13,"Apanhador");
		String equipeName = "Brasil";
		List<Jogador> elenco =  new ArrayList<Jogador>();
		elenco.add(jogA);
		Time brasil = new Time(equipeName,elenco);
		
		Jogador dida = new Jogador("Dida Potter",15,"Goleiro");
			
		
		//Ação
		brasil.addJogador(dida);
		
		//Verificação
		assertTrue(brasil.getElenco().contains(dida));
	}

}
