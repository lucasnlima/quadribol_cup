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
	private final Long idFase;
	
	@Column(nullable = false)
	private String nomeFase;

    @Column(nullable = false)
    private List<Time> participantes;

	public Fase(Long id, String nome, List<Time> participantes){
        this.idFase = id;
        this.nomeFase = nome;
        this.participantes = participantes;
    }
    
    public Long getIdFase() {
		return this.idFase;
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

}