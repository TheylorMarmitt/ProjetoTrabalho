package principal.model;

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
public class Filial {

	private Integer codigo;
	private String nome;
	private String cidade;
	private String uf;
	private List<Vendedor> vendedores;
	private List<Carro> carros;
}
