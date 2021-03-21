package quadribolapi.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GerenciadorUsuarios {
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
    
    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(List<Usuario> novoUsuarios) {
        this.usuarios = novoUsuarios;
    }

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void removeUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    public void login(String nomeUsuario, String senha) {
        for(Usuario temp : this.usuarios) {
			if(temp.getNomeUsuario() == nomeUsuario) {
                if(temp.getSenha() == senha) {
                    if(temp.getLogado() == true) {
                        System.out.println("Usuario ja logado");
                        return;
                    }
                    else {
                        temp.trocaLogado();
                        System.out.println("Login feito com sucesso");
                        return;
                    }
                }
                else {
                    System.out.println("Usuario ou senha incorretos");
                    return;
                }
            }
		}
        System.out.println("Usuario inexistente");
        return;
    }
}