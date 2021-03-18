package quadribolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transporte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long ID_TRANSPORTE;
	
	@Column(nullable = false)
	private final String TIPO_TRANSPORTE;

    @Column(nullable = false)
	private String enderecoTransporte;

    private static int contadorTransporte = 0;

	public Transporte(String tipo, String endereco){
        this.ID_TRANSPORTE = contadorTransporte;
        contadorTransporte++;
        this.TIPO_TRANSPORTE = tipo;
        this.enderecoTransporte = endereco;
    }
    
    public Long getIdTransporte() {
		return this.ID_TRANSPORTE;
	}

	public String getTipoTransporte() {
		return this.TIPO_TRANSPORTE;
	}

    public String getEnderecoTransporte() {
		return this.enderecoTransporte;
	}

    public void setEnderecoTransporte(String novoEndereco) {
		this.enderecoTransporte = novoEndereco;
	}

	public void exibirInfoTransporte () {
		System.out.printf("ID: 0x%016X", this.getIdTransporte());
        System.out.printf("Tipo: %s", this.getTipoTransporte());
        System.out.printf("Endereco: %s", this.getEnderecoTransporte());
	}

}