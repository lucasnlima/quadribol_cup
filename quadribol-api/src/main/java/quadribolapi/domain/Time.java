package quadribolapi.domain;

import java.util.ArrayList;
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
	
	public Time( String nome) {
		this.nome = nome;
		this.elenco = new ArrayList<Jogador>();
	}
	
	public Time( String nome, List<Jogador> elenco) {
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
	public List<Jogador> getElenco() {
		return this.elenco;
	}
	public void setElenco(List<Jogador> elenco) {
		this.elenco = elenco;
	}
	
	public void addJogador(Jogador jogador) {
		this.elenco.add(jogador);
	}
	
}