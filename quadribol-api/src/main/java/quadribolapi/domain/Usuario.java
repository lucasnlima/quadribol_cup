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
	private final Long id;
	
	@Column(nullable = false)
	private String nome;

    @Column(nullable = false)
	private String email;

    @Column(nullable = false)
	private String senha;

	public Usuario(Long ide, String nom, String em, String sen){
        this.id = ide;
        this.nome = mon;
        this.email = em;
        this.senha = sen;
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
        this.senha = nova;
    }

}