package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Jogador;
import quadribolapi.domain.Arbitro;
import quadribolapi.domain.Equipe;

class ArbitroUnitTest {

	@Test
	void testCriarArbitro() {
		
		//Quando
		Arbitro arb = new Arbitro(1, "Snape", 38);
		String novoNome = "Dumbledore";
		int novaIdade = 187;
		System.out.printf("\nTeste Unitário Arbitro - Antes das Modificações:");
		arb.exibirInfoArbitro();
		
		//Ação
		arb.setIdade(novaIdade);
		arb.setNome(novoNome);
		System.out.printf("\nTeste Unitário Arbitro - Depois das Modificações:");
		arb.exibirInfoArbitro();
		
		//Verificação
		assertEquals(arb.getNome(), novoNome);
		assertEquals(arb.getIdade(), novaIdade);
		
	}

}
