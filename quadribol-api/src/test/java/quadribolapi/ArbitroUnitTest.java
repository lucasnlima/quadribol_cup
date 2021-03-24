package quadribolapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import quadribolapi.domain.Arbitro;

class ArbitroUnitTest {

	@Test
	void testCriarArbitro() {
		
		//Quando
		Arbitro arb = new Arbitro("Snape", 38);
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
