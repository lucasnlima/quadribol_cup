package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TabelaJogos {
	
	@Column(nullable = false)
	private List<Fase> fase;
	
	@Column(nullable = false)
	private List<Jogo> partidas;

    @Column(nullable = false)
	private String chaveamento;


	public TabelaJogos(List<Fase> fase, List<Jogo> jogo, String chave) {
        this.fase = fase;
        this.partidas = jogo;
        this.chaveamento = chave;
    }
    

    public String getChaveamento() {
		return this.chaveamento;
	}

	public void setChaveamento(String novoChaveamento) {
		this.chaveamento = novoChaveamento;
	}

    
    public void consultarTabela(Long id, String nome, int participantes) {
        //fazer
    }

    public void inicializarTabela(String nome, int participantes) {
        //fazer
    }
	
	public void alterarTabela(String nome, int participantes) {
        //fazer
    }

	public void definirChaveamento(String nome, int participantes) {
        //fazer
    }


}