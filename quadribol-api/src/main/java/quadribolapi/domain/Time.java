package quadribolapi.domain;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Time {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	@OneToMany
	private List<Jogador> elenco;
	
	@ManyToMany
	@JoinTable(name="historico_partidas", joinColumns =
	{@JoinColumn(name="Time_id")},inverseJoinColumns =
	{@JoinColumn(name="jogo_id")})
	private List<Jogo> historicoPartidas;
	
	public Time() {
		super();
	}
	
	public Time(int id, String nome, List<Jogador> elenco) {
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
	public Object[] getElenco() {
		return this.elenco.toArray();
	}
	public void setElenco(Jogador[] elenco) {
		this.elenco = Arrays.asList(elenco);
	}
	
	public void addJogador(Jogador jogador) {
		this.elenco.add(jogador);
	}
	
}
