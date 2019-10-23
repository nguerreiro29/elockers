package elockers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "LOCALIZACAO", schema= "ELOCKERS")
public class Localizacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_LOCALIZACAO",  nullable=false, unique=true)
	private Integer idLocalizacao;
	
	@Column(name = "EDIFICIO",  length=255, nullable=false)
	private String edificio;
	
	@Column(name = "PISO",  length=16, nullable=false)
	private String piso;
	
	@Column(name = "AREA",  length=255, nullable=false)
	private String area;
	
	public Localizacao() {
		super();
	}

	public Localizacao(Integer idLocalizacao, String edificio, String piso, String area) {
		super();
		this.idLocalizacao = idLocalizacao;
		this.edificio = edificio;
		this.piso = piso;
		this.area = area;
	}
}
