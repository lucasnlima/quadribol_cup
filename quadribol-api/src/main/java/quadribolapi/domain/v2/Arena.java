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
	private final Long ID_ARENA;
	
	@Column(nullable = false)
	private String nomeArena;

    @Column(nullable = false)
	private int capacidade;

    @Column(nullable = false)
	private final String ENDERECO_ARENA;

    @Column(nullable = false)
    private List<Acomodacao> acomodacoes = new ArrayList<Acomodacao>();

    @Column(nullable = false)
    private List<Transporte> transportes = new ArrayList<Transporte>();

    private static int contadorArena = 0;

	public Arena(String nome, int capacidade, String endereco){
        this.ID_ARENA = contadorArena;
        contadorArena++;
        this.nomeArena = nome;
        this.capacidade = capacidade;
        this.ENDERECO_ARENA = endereco;
    }
    
    public Long getIdArena() {
		return this.ID_ARENA;
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
		return this.ENDERECO_ARENA;
	}

    public List<Acomodacao> getAcomodacoes() {
        return this.acomodacoes;
    }

    public void setAcomodacoes(List<Acomodacao> novoAcomodacoes) {
        this.acomodacoes = novoAcomodacoes;
    }

    public void addAcomodacao(Acomodacao acomodacao) {
        this.acomodacoes.add(acomodacao);
    }

    public void removeAcomodacao(Acomodacao acomodacao) {
        this.acomodacoes.remove(acomodacao);
    }

    public List<Transporte> getTransportes() {
        return this.transportes;
    }

    public void setTransportes(List<Transporte> novoTransporte) {
        this.transportes = novoTransporte;
    }

    public void addTransporte(Transporte transporte) {
        this.transportes.add(transporte);
    }

    public void removeTransporte(Transporte transporte) {
        this.transportes.remove(transporte);
    }

}