package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long ID_JOGADOR;
	
	@Column(nullable = false)
	private String nomeJogador;

    @Column(nullable = false)
	private int idadeJogador;

    @Column(nullable = false)
	private String posicao;

    @Column(nullable = false)
	private int pontos;

    private static int contadorJogador = 0;

	public Jogador(String nome, int idade, String posicao, int pontos){
<<<<<<< HEAD
        this.idJogador = contadorJogador;
=======
        this.ID_JOGADOR = (long) contadorJogador;
>>>>>>> origin/branch-joao
        contadorJogador++;
        this.nomeJogador = nome;
        this.idadeJogador = idade;
        this.posicao = posicao;
        this.pontos = pontos;
    }
    
    public Long getIdJogador() {
		return this.ID_JOGADOR;
	}

	public String getNomeJogador() {
		return this.nomeJogador;
	}

	public void setNomeJogador(String novoNome) {
		this.nomeJogador = novoNome;
	}

    public int getIdade() {
        return this.idadeJogador;
    }

    public void setIdade(int novaIdade) {
        this.idadeJogador = novaIdade;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String novaPosicao) {
        this.posicao = novaPosicao;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void setPontos(int novoPontos) {
        this.pontos = novoPontos;
    }

}