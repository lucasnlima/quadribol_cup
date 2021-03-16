package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Time {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long idTime;
	
	@Column(nullable = false)
	private String nomeTime;

    @Column(nullable = false)
	private List<Jogador> elenco;

    @Column(nullable = false)
	private List<Jogo> partidas;

	public Time(Long id, String nome, List<Jogador> elenco, List<Jogo> partidas){
        this.idTime = id;
        this.nomeTime = nome;
        this.elenco = elenco;
        this.partidas = partidas;
    }
    
    public Long getIdTime() {
		return this.idTime;
	}

	public String getNomeTime() {
		return this.nomeTime;
	}

	public void setNomeTime(String novoNome) {
		this.nomeTime = novoNome;
	}

    public List<Jogador> getElenco() {
        return this.elenco;
    }

    public void setElenco(List<Jogador> novoElenco) {
        this.elenco = novoElenco;
    }

    public void addJogador(Jogador jogador) {
        this.elenco.add(jogador);
    }

    public void removeJogador(Jogador jogador) {
        this.elenco.remove(jogador);
    }

    public List<Jogo> getPartidas() {
        return this.partidas;
    }

    public void setPartidas(List<Jogo> novoPartidas) {
        this.partidas = novoPartidas;
    }

    public void addPartida(Jogo partida) {
        this.partidas.add(partida);
    }

    public void removePartida(Jogo partida) {
        this.partidas.remove(partida);
    }

}