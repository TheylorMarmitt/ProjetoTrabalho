package principal.model;


import java.io.Serializable;
import java.util.List;

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
	private Integer cnpj; //não pode ser int, cnpj tem 14 caracteres numericos, int só permite até 9
	private List<Vendedor> vendedores;
	private List<Carro> carros;
	@Override
	public String toString() {
		return "Filial [codigo=" + codigo + ", nome=" + nome + ", cidade=" + cidade + ", uf=" + uf + ", cnpj=" + cnpj
				+ "]";
	}
	
	
	
	
	
}
