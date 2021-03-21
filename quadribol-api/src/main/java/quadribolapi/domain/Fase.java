package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String nome;

    @Column(nullable = false)
	private int numeroParticipantes;

	//Lista de jogos da fase

    public Fase() {
        super();
    }
    
	public Fase(Long id, String nome, int participantes) {
        this.id = id;
        this.nome = nome;
        this.numeroParticipantes = participantes;
    }
    
    public Long getId() {
		return id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

    public int getNumeroParticipantes() {
		return this.numeroParticipantes;
	}

	public void setNumeroParticipantes(int novoNumero) {
		this.numeroParticipantes = novoNumero;
	}

    
    public Fase incluirFase(Long id, String nome, int participantes) {
        Fase novaFase = new Fase(id, nome, participantes);
		return novaFase;
    }

    public void alterarFase(String nome, int participantes) {
        this.setNome(nome);
		this.setNumeroParticipantes(participantes);
    }

}