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
	private final Long ID_USUARIO;
	
	@Column(nullable = false)
	private String nomeUsuario;

    @Column(nullable = false)
	private String email;

    @Column(nullable = false)
	private String senha;

    private Boolean logado;

    protected static int contadorUsuario = 0;

	public Usuario(String nome, String email, String senha){
<<<<<<< HEAD
        this.idUsuario = contadorUsuario;
=======
        this.ID_USUARIO = (long) contadorUsuario;
>>>>>>> origin/branch-joao
        contadorUsuario++;
        this.nomeUsuario = nome;
        this.email = email;
        this.senha = senha;
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

}