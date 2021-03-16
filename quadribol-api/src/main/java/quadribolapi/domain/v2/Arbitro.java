package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Arbitro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long idArbitro;
	
	@Column(nullable = false)
	private String nomeArbitro;

    @Column(nullable = false)
	private int idadeArbitro;

	public Arbitro(Long id, String nome, int idade){
        this.idArbitro = id;
        this.nomeArbitro = nome;
        this.idadeArbitro = idade;
    }
    
    public Long getIdArbitro() {
		return this.idArbitro;
	}

	public String getNomeArbitro() {
		return this.nomeArbitro;
	}

	public void setNomeArbitro(String novoNome) {
		this.nomeArbitro = novoNome;
	}

    public int getIdade() {
        return this.idadeArbitro;
    }

    public void setIdade(int novaIdade) {
        this.idadeArbitro = novaIdade;
    }

}