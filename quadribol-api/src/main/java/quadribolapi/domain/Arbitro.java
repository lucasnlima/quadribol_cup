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
	private final Long ID_ARBITRO;
	
	@Column(nullable = false)
	private String nomeArbitro;

    @Column(nullable = false)
	private int idadeArbitro;

	private static int contadorArbitro = 0;

	public Arbitro(String nom, int idad) {
        this.nome = nom;
        this.idade = idad;
    }
    
    public Long getIdArbitro() {
		return this.ID_ARBITRO;
	}

	public String getNomeArbitro() {
		return this.nomeArbitro;
	}

	public void setNomeArbitro(String novoNome) {
		this.nomeArbitro = novoNome;
	}

    public int getIdadeArbitro() {
        return this.idadeArbitro;
    }

    public void setIdadeArbitro(int novaIdade) {
        this.idadeArbitro = novaIdade;
    }

	public void exibirInfoArbitro() {
		System.out.printf("ID: 0x%016X", this.getIdArbitro());
        System.out.printf("Nome: %s", this.getNomeArbitro());
        System.out.printf("Idade: %d", this.getIdadeArbitro());
	}

}