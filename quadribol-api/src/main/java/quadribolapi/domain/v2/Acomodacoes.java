package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Acomodacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long ID_ACOMODACAO;
	
	@Column(nullable = false)
	private String nomeAcomodacao;

    @Column(nullable = false)
	private final String ENDERECO_ACOMODACAO;

    private static int contadorAcomodacao = 0;

	public Acomodacao(String nome, String endereco){
        this.ID_ACOMODACAO = contadorAcomodacao;
        contadorAcomodacao++;
        this.nomeAcomodacao = nome;
        this.ENDERECO_ACOMODACAO = endereco;
    }
    
    public Long getIdAcomodacao() {
		return this.ID_ACOMODACAO;
	}

	public String getNomeAcomodacao() {
		return this.nomeAcomodacao;
	}

	public void setNomeAcomodacao(String novoNome) {
		this.nomeAcomodacao = novoNome;
	}

    public String getEndereco() {
		return this.ENDERECO_ACOMODACAO;
	}

}