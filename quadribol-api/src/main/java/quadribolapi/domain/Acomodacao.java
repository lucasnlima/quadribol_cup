package quadribolapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Acomodacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private float id;
	
	private String nome;
	
	private String endereco;

	public Acomodacao() {
		super();
	}
	
	public float getId() {
		return id;
	}

	public void setId(float id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
