package quadribolapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Classificacao {
	
	@Id
	private int posicao;
	@OneToOne
	private Time time;
	
	public Classificacao(int posicao, Time Time) {
		super();
		this.posicao = posicao;
		this.time = Time;
	}
	
	 public Classificacao() {
			super();
		}

	
	public int getPosicao() {
		return this.posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public Time getTime() {
		return this.time;
	}
	public void setTime(Time time) {
		this.time = time;
	}

}
