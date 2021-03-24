package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column(nullable = false)
	private String nome;

    @Column(nullable = false)
	private String email;

    @Column(nullable = false)
	private String senha;
    
    private Boolean logado;

	public Usuario(String nom, String em, String sen){
        this.nome = nom;
        this.email = em;
        this.senha = sen;
        this.logado = false;
    }
    
    public Long getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novon) {
		this.nome = novon;
	}

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String novoe) {
        this.email = novoe;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String novas) {
        this.senha = novas;
    }
    
    public boolean auth() {
        return this.logado;
    }
    
    public void login(String senha) {
    	if(senha == this.senha)
    		this.logado = true;
    }
    
    public void logout() {
        if(this.logado == true) {
            this.logado = false;
        }
        else {
            System.out.println("Usuario nao logado");
        }
    }

}