package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;

@Entity
public class TabelaJogos {
	
	@Column(nullable = false)
	private List<Fase> fase;


	public TabelaJogos(List<Fase> fase) {
        this.fase = fase;
    }
    
    public void consultarTabela(Long id, String nome, int participantes) {
        // retorna todos os jogos de todas as fases
    }

    // criar método para consultar fase específica pelo nome

    public void inicializarTabela(String nome, int participantes) {
        // receber lista de participantes e de locais
        // verificar se o número de participantes é par
        // gerar os jogos com os pares de participantes 
        // inicializar a fase
    }

}