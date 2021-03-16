package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Arena {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long idArena;
	
	@Column(nullable = false)
	private String nomeArena;

    @Column(nullable = false)
	private int capacidade;

    @Column(nullable = false)
	private final String endereco;

    @Column(nullable = false)
    private List<String> acomodacoes;

    @Column(nullable = false)
    private List<String> transportes;

	public Arena(Long id, String nome, int capacidade, String endereco, List<String> acomodacoes, List<String> transportes){
        this.idArena = id;
        this.nomeArena = nome;
        this.capacidade = capacidade;
        this.endereco = endereco;
        this.acomodacoes = acomodacoes;
        this.transportes = transportes;
    }
    
    public Long getIdArena() {
		return this.idArena;
	}

	public String getNomeArena() {
		return this.nomeArena;
	}

	public void setNomeArena(String novoNome) {
		this.nomeArena = novoNome;
	}

    public int getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(int novaCapacidade) {
		this.capacidade = novaCapacidade;
	}

    public String getEndereco() {
		return this.endereco;
	}

    public List<String> getAcomodacoes() {
        return this.acomodacoes;
    }

    public void setAcomodacoes(List<String> novoAcomodacoes) {
        this.acomodacoes = novoAcomodacoes;
    }

    public void addAcomodacao(String acomodacao) {
        this.acomodacoes.add(acomodacao);
    }

    public void removeAcomodacao(String acomodacao) {
        this.acomodacoes.remove(acomodacao);
    }

    public List<String> getTransportes() {
        return this.transportes;
    }

    public void setTransportes(List<String> novoTransporte) {
        this.transportes = novoTransporte;
    }

    public void addTransporte(String transporte) {
        this.transportes.add(transporte);
    }

    public void removeTransporte(String transporte) {
        this.transportes.remove(transporte);
    }

}