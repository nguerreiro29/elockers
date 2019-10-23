package elockers.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "OCUPACAO", schema= "ELOCKERS")
public class Ocupacao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_CACIFO",  nullable=false, unique=true)
	private Integer idOcupacao;
	
	private Integer idColaborador; //
	
	private Integer idCacifo;	//
	
	@Column(name = "DATA_INICIAL", nullable=false)
	private Date dataInicial;
	
	@Column(name = "DATA_FINAL")
	private Date dataFinal;
	
	@Column(name = "INFO", length=255)
	private String info;
	
	public Ocupacao() {
		super();
	}

	public Ocupacao(Integer idOcupacao, Integer idColaborador, Integer idCacifo, Date dataInicial, Date dataFinal,
			String info) {
		super();
		this.idOcupacao = idOcupacao;
		this.idColaborador = idColaborador;
		this.idCacifo = idCacifo;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.info = info;
	}
}
