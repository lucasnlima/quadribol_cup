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
	private final Long idUsuario;
	
	@Column(nullable = false)
	private String nomeUsuario;

    @Column(nullable = false)
	private String email;

    @Column(nullable = false)
	private String senha;

	public Usuario(Long id, String nome, String email, String senha){
        this.idUsuario = id;
        this.nomeUsuario = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public Long getIdUsuario() {
		return this.idUsuario;
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

}