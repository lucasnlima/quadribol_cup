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
	private final int id;
	
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


	public Jogo(int ide, String dat, Placar plac, Equipe partA, Equipe partB, Arbitro arb, PracaEsportiva loc) {
        this.id = ide;
        this.data = dat;
        this.placar = plac;
        this.participanteA = partA;
        this.participanteB = partB;
        this.arbitro = arb;
        this.local = loc;
    }
    
    public int getId() {
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
        
        System.out.printf("\nID: 0x%016X\n", this.getId());
        System.out.printf("Participantes: %s x %s\n", this.getParticipanteA().getNome(), this.getParticipanteB().getNome()); // colocar nome da equipe
        System.out.printf("Placar: %d x %d\n", this.getPlacar().getGolsParticipanteA(), this.getPlacar().getGolsParticipanteB());
		System.out.printf("Arbitro: %s\n", this.getArbitro().getNome());
        System.out.printf("Local: %s\n", this.getPracaEsportiva().getNome());

    }

    public void alterarJogo(char time) {
        
        if (time == 'A') {
			this.placar.marcaGolA();
		} else if (time == 'B') {
			this.placar.marcaGolB();
		}
        
    }

}
