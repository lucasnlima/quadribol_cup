package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PracaEsportiva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;
	
	@Column(nullable = false)
	private String nome;

    @Column(nullable = false)
	private int capacidade;

    @Column(nullable = false)
	private final String endereco;

    @Column(nullable = false)
    private List<String> acomodacoes;

	public PracaEsportiva(Long ide, String nom, int cap, String end, List<String> aco) {
        this.id = ide;
        this.nome = nom;
        this.capacidade = cap;
        this.endereco = end;
        this.acomodacoes = aco;
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

    public int getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(int novac) {
		this.capacidade = novac;
	}

    public String getEndereco() {
		return this.endereco;
	}

	public List<String> getAcomodacoes() {
        return this.acomodacoes;
    }
    
    public void addAcomodacao(String aco) {
        this.acomodacoes.add(aco);
    }

    public void removeAcomodacao(String aco) {
        this.acomodacoes.remove(aco);
    }

    public void exibirInfo() {
        
        System.out.printf("ID: 0x%016X", this.getId);
        System.out.printf("Nome: %s", this.getNome);
        System.out.printf("Capacidade: %d", this.getCapacidade);
        System.out.printf("Endereco: %s", this.getEndereco);
        System.out.println("Acomodacoes: ");
        for(int i = 0; i < this.acomodacoes.size(); i++) {
            System.out.println(this.acomodacoes.get(i));
        }
    }

}