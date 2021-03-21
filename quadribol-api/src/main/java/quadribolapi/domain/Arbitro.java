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

	public Arbitro(String nome, int idade){
        this.ID_ARBITRO = (long) contadorArbitro;
		contadorArbitro++;
        this.nomeArbitro = nome;
        this.idadeArbitro = idade;
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

    public int getIdade() {
        return this.idadeArbitro;
    }

    public void setIdade(int novaIdade) {
        this.idadeArbitro = novaIdade;
    }

	public void exibirInfoArbitro() {
        
        System.out.printf("\nID: 0x%016X\n", this.getIdArbitro());
        System.out.printf("Nome: %s\n", this.getNomeArbitro());
        System.out.printf("Idade: %d\n", this.getIdade());
        
    }

}