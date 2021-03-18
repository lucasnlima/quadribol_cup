package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import quadribolapi.domain.Jogo;

@Entity
public class Fase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long ID_FASE;
	
	@Column(nullable = false)
	private String nomeFase;

    @Column(nullable = false)
    private List<Time> participantes = new ArrayList<Time>();

    @Column(nullable = false)
    private List<Jogo> jogos = new ArrayList<Jogo>();

    private static int contadorFase = 0;

	public Fase(String nome){
        this.idFase = contadorFase;
        contadorFase++;
        this.nomeFase = nome;
    }
    
    public Long getIdFase() {
		return this.ID_FASE;
	}

	public String getNomeFase() {
		return this.nomeFase;
	}

	public void setNomeFase(String novoNome) {
		this.nomeFase = novoNome;
	}

    public List<Time> getParticipantes() {
        return this.participantes;
    }

    public void setParticipantes(List<Time> novoParticipantes) {
        this.participantes = novoParticipantes;
    }

    public void addParticipante(Time participante) {
        this.participantes.add(participante);
    }

    public void removeParticipante(Time participante) {
        this.participantes.remove(participante);
    }

    public List<Jogo> getJogos() {
        return this.jogos;
    }

    public void setJogos(List<Jogo> novoJogos) {
        this.jogos = novoJogos;
    }

    public void addJogo(Jogo jogo) {
        this.jogos.add(jogo);
    }

    public void removeJogo(Jogo jogo) {
        this.jogos.remove(jogo);
    }

    public int totalPontosFase() {
        int totalPontos = 0;
        for(Jogo temp : this.jogos) {
            totalPontos += temp.totalPontosJogo();
        }
        System.out.printf("Total de pontos da fase: %d", totalPontos);
        return totalPontos;
    }

    public int numeroParticipantes() {
        return this.participantes.lenght;
    }

    public int numeroJogos() {
        return this.jogos.lenght;
    }

    public Time melhorTime() {
        Time melhorTime = this.participantes.get(0);
        for(Time temp : this.participantes) {
            if(temp.totalPontosJogos() > melhorTime.totalPontosJogos()) {
                melhorTime = temp;
            }
        }
        return melhorTime;
    }

    public void sortear() {
        // usar a lista de participantes e sortear os confrontos, criando jogos e colocando na lista de jogos
    }

    public void exibirFase() {
        // imprime todos os jogos da fase
    }

}