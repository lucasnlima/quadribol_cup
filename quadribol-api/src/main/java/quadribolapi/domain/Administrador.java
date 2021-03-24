package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrador extends Usuario {

    @Column(nullable = false)
	private int ranking;

	public Administrador(String nome, String email, String senha, int ranking){
        this(nome, email, senha);
        this.ranking = ranking;
    }

    public int getRanking(){
        return this.ranking;
    }

    public void setRanking(int novoRanking) {
        this.ranking = novoRanking;
    }

    public void promover() {
        this.ranking++;
    }

}