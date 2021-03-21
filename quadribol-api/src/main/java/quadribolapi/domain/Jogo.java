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

    @Column(nullable = false)
	private Arena local;

    @Column(nullable = false)
	private Time timeA;

    @Column(nullable = false)
	private Time timeB;

    @Column(nullable = false)
	private int pontosA;

    @Column(nullable = false)
	private int pontosB;

    @Column(nullable = false)
	private Arbitro arbitro;

    private static int contadorJogo = 0;

<<<<<<< HEAD
	public Jogo(Time timeA, Time timeB, Arena local, String data, int pontosA, int pontosB, Arbitro arbitro){
        this.idJogo = contadorJogo;
        contadorJogo++;
        this.timeA = timeA;
        this.timeB = timeB;
        if(data) {
            this.data = data;
        }
        if(local) {
            this.local = local;
        }
        if(pontosA) {
            this.pontosA = pontosA;
        }
        if(pontosB) {
            this.pontosB = pontosB;
        }
        if(arbitro) {
            this.arbitro = arbitro;
        }
=======
	public Jogo(String data, Arena local, Time timeA, Time timeB, int pontosA, int pontosB, Arbitro arbitro){
        this.ID_JOGO = (long) contadorJogo;
        contadorJogo++;
        this.data = data;
        this.local = local;
        this.timeA = timeA;
        this.timeB = timeB;
        this.pontosA = pontosA;
        this.pontosB = pontosB;
        this.arbitro = arbitro;
>>>>>>> origin/branch-joao
        // adicionar jogo ao time quando o jogo for criado
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

    public void setLocal(Arena novoLocal) {
        this.local = novoLocal;
    }

    public Time getTimeA(){
        return this.timeA;
    }

    public void setTimeA(Time novoTimeA) {
        this.timeA = novoTimeA;
    }

    public Time getTimeB(){
        return this.timeB;
    }

    public void setTimeB(Time novoTimeB) {
        this.timeB = novoTimeB;
    }

    public int getPontosA(){
        return this.pontosA;
    }

    public void setPontosA(int novoPontosA) {
        this.pontosA = novoPontosA;
    }

    public int getPontosB(){
        return this.pontosB;
    }

    public void setPontosB(int novoPontosB) {
        this.pontosB = novoPontosB;
    }

    public Arbitro getArbitro(){
        return this.arbitro;
    }

    public void setArbitro(Arbitro novoArbitro) {
        this.arbitro = novoArbitro;
    }

    public void marcarPonto(String nomeTime) {
        if(this.timeA.getNomeTime() == nomeTime) {
            this.pontosA++;
        }
<<<<<<< HEAD
        if(this.timeB.getNomeTime() == nomeTime) {
            this.pontosB++;
        }
        else {
            System.out.println("Nome de time invalido");
=======
        else if(this.timeB.getNomeTime() == nomeTime) {
            this.pontosB++;
        }
        else {
            System.out.println("\nNome de time invalido");
>>>>>>> origin/branch-joao
        }
    }

    public void exibirInfoJogo() {
<<<<<<< HEAD
        System.out.printf("ID: 0x%016X", this.getIdJogo());
        System.out.printf("Data: %s", this.getData());
        System.out.printf("Local: %s", this.getLocal().getNomeArena());
        System.out.printf("Arbitro: %s", this.getArbitro().getNomeArbitro());
        System.out.printf("Time A: %s", this.getTimeA().getNomeTime());
        System.out.printf("Pontos time A: %d", this.getPontosA());
        System.out.printf("Time B: %s", this.getTimeB().getNomeTime());
        System.out.printf("Pontos time B: %d", this.getPontosB());
=======
        System.out.printf("\nID: 0x%016X\n", this.getIdJogo());
        System.out.printf("Data: %s\n", this.getData());
        System.out.printf("Local: %s\n", this.getLocal().getNomeArena());
        System.out.printf("Arbitro: %s\n", this.getArbitro().getNomeArbitro());
        System.out.printf("Time A: %s\n", this.getTimeA().getNomeTime());
        System.out.printf("Pontos time A: %d\n", this.getPontosA());
        System.out.printf("Time B: %s\n", this.getTimeB().getNomeTime());
        System.out.printf("Pontos time B: %d\n", this.getPontosB());
>>>>>>> origin/branch-joao
    }

    public int totalPontosJogo() {
        int total = this.getPontosA()+this.getPontosB();
        System.out.printf("Total de pontos no jogo: %d", total);
        return total;
    }

}