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
        return this.participantes.length;
    }

    public int numeroJogos() {
        return this.jogos.length;
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

    //Sorteia participantes e inicializa jogos
    public void sortear() {
    List<Jogo> jogos = new ArrayList<>();
    List<Time> temp = this.participantes;
    int aux = temp.size();
        for (int i = 0; i < aux; i = i+2) {
            do {
                int random1 = (int)Math.random()*(temp.size());
                int random2 = (int)Math.random()*(temp.size());
            } while (random1 === random2)
            Time timeA = temp.get(random1);
            Time timeB = temp.get(random2);
            jogos.add(new Jogo(timeA, timeB));
            temp.remove(random1);
            temp.remove(random2);
    }
    setJogos(jogos);
}

    //Sorteria participantes se lista de jogos já fora incializada sem definir os participantes de cada jogo
    public void sortearParticipantes() {
    List<Time> temp = this.participantes;
    int i = 0;
        for (Jogo jogo : this.jogos) {
            do {
                int random1 = (int)Math.random()*(temp.size());
                int random2 = (int)Math.random()*(temp.size());
            } while (random1 === random2)
            Time timeA = temp.get(random1);
            Time timeB = temp.get(random2);
            jogo.setTimeA(timeA);
            jogo.setTimeB(timeB);
            temp.remove(random1);
            temp.remove(random2);
            i++;
    }
}
    

    public void exibirFase() {
        for(Jogo temp : this.jogos) {
            temp.exibirInfoJogo();
        }
    }

}