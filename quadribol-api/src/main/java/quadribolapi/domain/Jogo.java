package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	private Arena local;

	@ManyToOne
    private Fase fase;
	
	@ManyToOne(optional = false)
	private Time timeA;
 
    @ManyToOne(optional = false)
	private Time timeB;

	private int pontosA;
	
	private int pontosB;

    @ManyToOne
	private Arbitro arbitro;
    
    private boolean finalizado;
    
    public Jogo() {
		super();
	}


	public Jogo(Long ide, String dat,Arena loc, Fase fase, Time partA, Time partB, Arbitro arb) {
        this.id = ide;
        this.data = dat;
        this.local = loc;
        this.fase = fase;
        this.pontosA = 0;
        this.pontosB = 0;
        this.timeA = partA;
        this.timeB = partB;
        this.arbitro = arb;
        this.finalizado = false;
    }
    
    public boolean isFinalizado() {
		return finalizado;
	}


	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
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

    public Arena getArena() {
		return this.local;
	}

	public void setArena(Arena novol) {
		this.local = novol;
	}

    public Arena getLocal() {
		return local;
	}

	public void setLocal(Arena local) {
		this.local = local;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public Time getTimeA() {
		return timeA;
	}

	public void setTimeA(Time timeA) {
		this.timeA = timeA;
	}

	public Time getTimeB() {
		return timeB;
	}

	public void setTimeB(Time timeB) {
		this.timeB = timeB;
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
	        System.out.printf("Participantes: %s x %s", this.getTimeA(), this.getTimeB()); // colocar nome da Time
	        System.out.printf("Arbitro: %s", this.getArbitro().getNome());
	        System.out.printf("Local: %s", this.getArena().getNome());
	        System.out.printf("Placar:%s x %s", this.getPontosA(), this.getPontosB());

	    }

	 public void marcarPontoA() {
	      this.pontosA++;  
	  }
	 
	 public void marcarPontoB() {
		 this.pontosB++;
	 }
	       

}