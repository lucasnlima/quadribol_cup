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
	private String nomeUsuario;

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
    
    public Long getIdUsuario() {
		return this.ID_USUARIO;
	}

	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	public void setNomeUsuario(String novoNome) {
		this.nomeUsuario = novoNome;
	}

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public Boolean getLogado() {
        return this.logado;
    }

    public void trocaLogado() {
        if(this.logado == true) {
            this.logado = false;
        }
        else {
            this.logado = true;
        }
    }

    public void logout() {
        if(this.logado == true) {
            this.trocaLogado();
        }
        else {
            System.out.println("Usuario nao logado");
        }
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