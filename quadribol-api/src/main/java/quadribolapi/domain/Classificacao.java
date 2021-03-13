package quadribolapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Classificacao {
	
	@Id
	private int posicao;
	@OneToOne
	private Equipe equipe;
	
	public Classificacao(int posicao, Equipe equipe) {
		super();
		this.posicao = posicao;
		this.equipe = equipe;
	}
	
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

}
