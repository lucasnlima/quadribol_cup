package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;
	
	@Column(nullable = false)
	private String data;

    @Column(nullable = false)
	private Placar placar;

    @Column(nullable = false)
	private Equipe participanteA;

    @Column(nullable = false)
	private Equipe participanteB;

    @Column(nullable = false)
	private Arbitro arbitro;

    @Column(nullable = false)
	private PracaEsportiva local;

	// add métodos marcar gol time A/B

	public Jogo(Long ide, String dat, Placar plac, Equipe partA, Equipe partB, Arbitro arb, PracaEsportiva loc) {
        this.id = ide;
        this.data = dat;
        this.placar = plac;
        this.participanteA = partA;
        this.participanteB = partB;
        this.arbitro = arb;
        this.local = loc;
    }
    
    public Long getId() {
		return id;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String novad) {
		this.data = novad;
	}

    public Placar getPlacar() {
		return this.placar;
	}

	public void setPlacar(Placar novap) {
		this.placar = novap;
	}

    public Equipe getParticipanteA() {
		return this.participanteA;
	}

    public void setParticipanteA(Equipe novaeqa) {
		this.participanteA = novaeqa;
	}

    public Equipe getParticipanteB() {
		return this.participanteB;
	}

    public void setParticipanteB(Equipe novaeqb) {
		this.participanteB = novaeqb;
	}

    public Arbitro getArbitro() {
		return this.arbitro;
	}

	public void setArbitro(Arbitro novoa) {
		this.arbitro = novoa;
	}

    public PracaEsportiva getPracaEsportiva() {
		return this.local;
	}

	public void setPracaEsportiva(PracaEsportiva novol) {
		this.local = novol;
	}

    public void exibirInfoJogo() {
        
        System.out.printf("ID: 0x%016X", this.getId());
        System.out.printf("Participantes: %s x %s", this.getParticipanteA(), this.getParticipanteB()); // colocar nome da equipe
        System.out.printf("Arbitro: %s", this.getArbitro().getNome());
        System.out.printf("Local: %s", this.getPracaEsportiva().getNome());
        System.out.printf("Placar: %s", this.getPlacar().getEstatisticas());

    }

    public void alterarJogo() {
        
        // FAZER
        
    }

}