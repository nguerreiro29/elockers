package elockers.entity;

import elockers.enums.TipoStaff;
import lombok.Data;

@Data
public class Staff {
	private Integer idColaborador;
	private String nome;
	private String email;
	private TipoStaff tipoStaff;
	
	public Staff() {
		super();
	}

	public Staff(Integer idColaborador, String nome, String email, TipoStaff tipoStaff) {
		super();
		this.idColaborador = idColaborador;
		this.nome = nome;
		this.email = email;
		this.tipoStaff = tipoStaff;
	}
}
