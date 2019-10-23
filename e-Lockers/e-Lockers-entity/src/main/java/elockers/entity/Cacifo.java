package elockers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import elockers.enums.Estado;
import lombok.Data;

@Data
@Entity
@Table(name = "CACIFO", schema= "ELOCKERS")
public class Cacifo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_CACIFO",  nullable=false, unique=true)
	private Integer idCacifo;
	
	@Column(name = "N_VISIVEL", nullable=false)
	private Integer nVisivel;
	
	@Column(name = "MANUTENCAO", nullable=false)
	private Boolean manutencao;
	
	@Column(name = "ESTADO", length=255, nullable=false)
	private Estado estado;
	
	//
	private Localizacao localizacao;
	
	public Cacifo() {
		super();
	}

	public Cacifo(Integer idCacifo, Integer nVisivel, Boolean manutencao, Estado estado, Localizacao localizacao) {
		super();
		this.idCacifo = idCacifo;
		this.nVisivel = nVisivel;
		this.manutencao = manutencao;
		this.estado = estado;
		this.localizacao = localizacao;
	}
}
