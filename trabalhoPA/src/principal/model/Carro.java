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
public class Carro implements Serializable{
	

	private static final long serialVersionUID = -2988664017936340351L;
	
	private Integer codigo;
	private String marca;
	private String modelo;
	private Double valor;
	private String cor;
	private Integer ano;
	private String placa;
	private Boolean disponivel;
	
}
