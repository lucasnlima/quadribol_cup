package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin extends Usuario {

	public Admin(Long ide, String nom, String em, String sen){
        this.id = ide;
        this.nome = mon;
        this.email = em;
        this.senha = sen;
    }
	
	public void deletarUsuario(Usuario usr) {
		// implementar
	}

}