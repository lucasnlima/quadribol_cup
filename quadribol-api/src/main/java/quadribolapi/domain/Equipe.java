package quadribolapi.domain;

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
	private Jogador[] elenco;
	//private Jogo[] partidads;
	
	public Equipe(int id, String nome, Jogador[] elenco) {
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
		return elenco;
	}
	public void setElenco(Jogador[] elenco) {
		this.elenco = elenco;
	}
	
	

}
