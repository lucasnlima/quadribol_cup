package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Jogador;
import quadribolapi.domain.Equipe;

class EquipeUnitTest {

	@Test
	void test() {
		
		//Quando
		Jogador jogA = new Jogador("Ronaldinho Potter",13,"Apanhador");
		String equipeName = "Brasil";
		List<Jogador> elenco =  new ArrayList<Jogador>();
		elenco.add(jogA);
		
		Equipe brasil = new Equipe(1,equipeName,elenco);
		
		//Ação
		Jogador[] elencoResponse = (Jogador[]) brasil.getElenco();
		
		//Verificação
		assertTrue(elencoResponse.length>1);
	}
	
	@Test
	void testAddJogador() {
		//Quando
		Jogador jogA = new Jogador("Ronaldinho Potter",13,"Apanhador");
		String equipeName = "Brasil";
		List<Jogador> elenco =  new ArrayList<Jogador>();
		elenco.add(jogA);
		Equipe brasil = new Equipe(1,equipeName,elenco);
		
		Jogador dida = new Jogador("Dida Potter",15,"Goleiro");
			
		
		//Ação
		brasil.addJogador(dida);
		
		//Verificação
		assertTrue(Arrays.asList(brasil.getElenco()).contains(dida));
	}

}
