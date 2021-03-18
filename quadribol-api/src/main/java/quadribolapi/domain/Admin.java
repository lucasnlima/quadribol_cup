package quadribolapi.domain;

import javax.persistence.Entity;

@Entity
public class Admin extends Usuario {
	
	public Admin(Long ide, String nom, String em, String sen) {
		super(ide, nom, em, sen);
		// TODO Auto-generated constructor stub
	}

	//public void deletarUsuario(Usuario usr) {
	//	// implementar
	//}

}