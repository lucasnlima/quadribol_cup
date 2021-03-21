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
        this.idJogador = contadorJogador;
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

    public int getIdadeJogador() {
        return this.idadeJogador;
    }

    public void setIdadeJogador(int novaIdade) {
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

    public void exibirInfoJogador() {
        System.out.printf("ID: 0x%016X", this.getIdJogador());
        System.out.printf("Nome: %s", this.getNomeJogador());
        System.out.printf("Idade: %d", this.getIdadeJogador());
        System.out.printf("Posicao: %s", this.getPosicao());
        System.out.printf("Pontos: %d", this.getPontos());
    }

}