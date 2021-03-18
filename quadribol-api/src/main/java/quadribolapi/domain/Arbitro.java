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
	private long id;
	
	@Column(nullable = false)
	private String nome;

    @Column(nullable = false)
	private int idade;
    
    public Arbitro() {
		super();
	}

	public Arbitro(Long ide, String nom, int idad) {
        this.id = ide;
        this.nome = nom;
        this.idade = idad;
    }
    
    public Long getId() {
		return id;
	}

    public String getNome() {
		return this.nome;
	}

	public void setNome(String novon) {
		this.nome = novon;
	}

    public int getIdade() {
		return this.idade;
	}

    public void setIdade(int novai) {
		this.idade = novai;
	}

    public void exibirInfoArbitro() {
        
        System.out.printf("ID: 0x%016X", this.getId());
        System.out.printf("Nome: %s", this.getNome());
        System.out.printf("Idade: %d", this.getIdade());
        
    }

}