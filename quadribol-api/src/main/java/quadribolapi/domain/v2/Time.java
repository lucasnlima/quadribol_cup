package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import quadribolapi.domain.Jogo;

@Entity
public class Time {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long ID_TIME;
	
	@Column(nullable = false)
	private String nomeTime;

    @Column(nullable = false)
	private List<Jogador> elenco = new ArrayList<Jogador>();

    @Column(nullable = false)
	private List<Jogo> partidas = new ArrayList<Jogo>();

    private static int contadorTime = 0;

	public Time(String nome){
        this.idTime = contadorTime;
        contadorTime++;
        this.nomeTime = nome;
        this.elenco = elenco;
        this.partidas = partidas;
    }
    
    public Long getIdTime() {
		return this.ID_TIME;
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

    public int totalPontosJogos() {
        int total = 0;
        for(Jogo temp : this.getPartidas()) {
            if(temp.getTimeA() == this) {
                total += temp.getPontosA();
            }
            else {
                total += temp.getPontosB();
            }
        }
        return total;
    }

    public void exibirInfoTime() {
        // imprime info time
    }
}