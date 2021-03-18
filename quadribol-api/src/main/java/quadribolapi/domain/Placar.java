package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Placar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;
	
    @Column(nullable = false)
	private int golsParticipanteA;

	@Column(nullable = false)
	private int golsParticipanteB;

	@Column(nullable = false)
	private String estatisticas;

	public Placar(int golsA, int golsB, String estat) {
        this.id = null;
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

	public void marcaGolA() {
		this.golsParticipanteA = this.golsParticipanteA + 1;
	}

	public void marcaGolB() {
		this.golsParticipanteB = this.golsParticipanteB + 1;
	}

    public void setEstatisticas(String novae) {
		this.estatisticas = novae;
	}

    public void exibirPlacar() {
        
        System.out.printf("\nGols Participante A: %d\n", this.getGolsParticipanteA());
        System.out.printf("Gols Participante B: %d\n", this.getGolsParticipanteB());
        System.out.printf("Estatisticas: %s\n", this.getEstatisticas());
        
    }

}