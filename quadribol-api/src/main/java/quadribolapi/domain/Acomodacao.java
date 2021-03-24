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
	
	private String nome;
	
	private String endereco;

	public Acomodacao() {
		super();
	}
	
	public Acomodacao(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
	
	public float getId() {
		return id;
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

	public void exibirInfoAcomodacao () {
		System.out.printf("ID: 0x%016X", this.getIdAcomodacao());
        System.out.printf("Nome: %s", this.getNomeAcomodacao());
        System.out.printf("Endereco: %s", this.getEndereco());
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void exibirInfoAcomodacao () {
		System.out.printf("ID: 0x%016X", this.getId());
        System.out.printf("Nome: %s", this.getNome());
        System.out.printf("Endereco: %s", this.getEndereco());
	}
	

}
