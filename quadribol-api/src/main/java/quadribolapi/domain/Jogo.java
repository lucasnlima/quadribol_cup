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
	private final Long ID_JOGO;
	
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

    @Column(nullable = false)
	private Time timeB;

    @Column(nullable = false)
	private int pontosA;

    @Column(nullable = false)
	private int pontosB;

    @Column(nullable = false)
	private Arbitro arbitro;
    
    private boolean finalizado;
    
    public Jogo() {
		super();
	}


	public Jogo( String dat,Arena loc, Fase fase, Time partA, Time partB, Arbitro arb) {
        this.data = dat;
        this.local = loc;
        this.fase = fase;
        this.pontosA = 0;
        this.pontosB = 0;
        this.timeA = partA;
        this.timeB = partB;
        this.arbitro = arb;
        this.finalizado = false;
        // adicionar jogo ao time quando o jogo for criado
    }

    public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
    
    public Long getIdJogo() {
		return this.ID_JOGO;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String novaData) {
		this.data = novaData;
	}

    public Arena getLocal() {
        return this.local;
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

    public void setTimeB(Time novoTimeB) {
        this.timeB = novoTimeB;
    }

    public int getPontosA(){
        return this.pontosA;
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

    public void setArbitro(Arbitro novoArbitro) {
        this.arbitro = novoArbitro;
    }

    public void marcarPonto(String nomeTime) {
        if(this.timeA.getNomeTime() == nomeTime) {
            this.pontosA++;
        }
        else if(this.timeB.getNomeTime() == nomeTime) {
            this.pontosB++;
        }
        else {
            System.out.println("\nNome de time invalido");
        }
    }

    public void exibirInfoJogo() {
        System.out.printf("\nID: 0x%016X\n", this.getIdJogo());
        System.out.printf("Data: %s\n", this.getData());
        System.out.printf("Local: %s\n", this.getLocal().getNomeArena());
        System.out.printf("Arbitro: %s\n", this.getArbitro().getNomeArbitro());
        System.out.printf("Time A: %s\n", this.getTimeA().getNomeTime());
        System.out.printf("Pontos time A: %d\n", this.getPontosA());
        System.out.printf("Time B: %s\n", this.getTimeB().getNomeTime());
        System.out.printf("Pontos time B: %d\n", this.getPontosB());
    }

	public void setPontosB(int pontosB) {
		this.pontosB = pontosB;
	}
	
	 public void exibirInfoJogo() {
	        
	        System.out.printf("ID: 0x%016X", this.getId());
	        System.out.printf("Data: %s\n", this.getData());
	        System.out.printf("Arbitro: %s", this.getArbitro().getNome());
	        System.out.printf("Local: %s", this.getArena().getNome());
	        System.out.printf("Placar:%s x %s", this.getPontosA(), this.getPontosB());
	        System.out.printf("Time A: %s\n", this.getTimeA().getNome());
	        System.out.printf("Pontos time A: %d\n", this.getPontosA());
	        System.out.printf("Time B: %s\n", this.getTimeB().getNome());
	        System.out.printf("Pontos time B: %d\n", this.getPontosB());

	    }

	 public void marcarPontoA() {
	      this.pontosA++;  
	  }
	 
	 public void marcarPontoB() {
		 this.pontosB++;
	 }
	       

}