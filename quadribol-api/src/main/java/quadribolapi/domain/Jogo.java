package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	
	private String data;
	
    @ManyToOne
	private PracaEsportiva local;

	@ManyToOne
    private Fase fase;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Equipe equipeA;
 
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Equipe equipeB;

	private int pontosA;
	
	private int pontosB;

    @ManyToOne
	private Arbitro arbitro;
    
    public Jogo() {
		super();
	}


	public Jogo(Long ide, String dat,PracaEsportiva loc, Fase fase, Equipe partA, Equipe partB, Arbitro arb) {
        this.id = ide;
        this.data = dat;
        this.local = loc;
        this.fase = fase;
        this.pontosA = 0;
        this.pontosB = 0;
        this.equipeA = partA;
        this.equipeB = partB;
        this.arbitro = arb;
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

    public PracaEsportiva getLocal() {
		return local;
	}

	public void setLocal(PracaEsportiva local) {
		this.local = local;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public Equipe getEquipeA() {
		return equipeA;
	}

	public void setEquipeA(Equipe equipeA) {
		this.equipeA = equipeA;
	}

	public Equipe getEquipeB() {
		return equipeB;
	}

	public void setEquipeB(Equipe equipeB) {
		this.equipeB = equipeB;
	}

	public int getPontosA() {
		return pontosA;
	}

	public void setPontosA(int pontosA) {
		this.pontosA = pontosA;
	}

	public int getPontosB() {
		return pontosB;
	}

	public void setPontosB(int pontosB) {
		this.pontosB = pontosB;
	}
	
	 public void exibirInfoJogo() {
	        
	        System.out.printf("ID: 0x%016X", this.getId());
	        System.out.printf("Participantes: %s x %s", this.getEquipeA(), this.getEquipeB()); // colocar nome da equipe
	        System.out.printf("Arbitro: %s", this.getArbitro().getNome());
	        System.out.printf("Local: %s", this.getPracaEsportiva().getNome());
	        System.out.printf("Placar:%s x %s", this.getPontosA(), this.getPontosB());

	    }

	public void alterarJogo() {
        
        // FAZER
        
    }

}