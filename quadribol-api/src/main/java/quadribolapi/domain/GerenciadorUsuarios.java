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

    public int login(String nomeUsuario, String senha) {
        for(Usuario temp : this.usuarios) {
			if(temp.getNomeUsuario() == nomeUsuario) {
                if(temp.getSenha() == senha) {
                    if(temp.getLogado() == true) {
                        System.out.println("Usuario ja logado");
                        return 0;
                    }
                    else {
                        temp.trocaLogado();
                        System.out.println("Login feito com sucesso");
                        return 1;
                    }
                }
                else {
                    System.out.println("Usuario ou senha incorretos");
                    return 2;
                }
            }
		}
        System.out.println("Usuario inexistente");
        return 3;
    }
}