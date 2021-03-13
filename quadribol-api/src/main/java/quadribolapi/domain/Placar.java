package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Placar {
	
    @Column(nullable = false)
	private int golsParticipanteA;

	@Column(nullable = false)
	private int golsParticipanteB;

	@Column(nullable = false)
	private String estatisticas;

	// add métodos marcar gol time A/B

	public Placar(int golsA, int golsB, String estat) {
        this.golsParticipanteA = golsA;
        this.golsParticipanteB = golsB;
        this.estatisticas = estat;
    }

	public int getGolsParticipanteA() {
		return this.golsParticipanteA;
	}

	public void setGolsParticipanteA(int novogola) {
		this.golsParticipanteA = novogola;
	}

    public int getGolsParticipanteB() {
		return this.golsParticipanteB;
	}

	public void setGolsParticipanteB(int novogolb) {
		this.golsParticipanteB = novogolb;
	}

    public String getEstatisticas() {
		return this.estatisticas;
	}

    public void setEstatisticas(String novae) {
		this.estatisticas = novae;
	}

    public void exibirPlacar() {
        
        System.out.printf("Gols Participante A: %d", this.getGolsParticipanteA());
        System.out.printf("Gols Participante B: %d", this.getGolsParticipanteB());
        System.out.printf("Estatisticas: %s", this.getEstatisticas());
        
    }

}