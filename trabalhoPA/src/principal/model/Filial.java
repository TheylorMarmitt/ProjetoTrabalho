package principal.model;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor

@EqualsAndHashCode(of="codigo")
public class Filial implements Serializable{
	
	private static final long serialVersionUID = -6911788269286949660L;
	private Integer codigo;
	private String nome;
	private String cidade;
	private String uf;
	private Integer cnpj; //nao pode ser int, cnpj tem 14 caracteres numericos, int so permite ate 9

	
	@Override
	public String toString() {
		return this.nome;
	}
	
}
