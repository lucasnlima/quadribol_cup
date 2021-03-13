package quadribolapi.domain;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private List<Jogador> elenco;
	private Jogo[] historicoPartidas;
	
	public Equipe(int id, String nome, List<Jogador> elenco) {
		super();
		this.id = id;
		this.nome = nome;
		this.elenco = elenco;
	}
	
	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Jogador[] getElenco() {
		return elenco.toArray(new Jogador[23]);
	}
	public void setElenco(Jogador[] elenco) {
		this.elenco = Arrays.asList(elenco);
	}
	
	public void addJogador(Jogador jogador) {
		this.elenco.add(jogador);
	}
	
	// remover jogadores individualmente
	
	

}
