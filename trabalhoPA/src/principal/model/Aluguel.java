package principal.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
public class Aluguel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4386655266802551653L;
	
	private Integer codigo;
	private LocalDate dataAluguel;
	private LocalDate dataDevolucao;
	private Carro carro;
	private Cliente cliente;
	private Vendedor vendedor;
	private Filial filial;

	public Integer diasLocacao() {
		long dias;
		dias = ChronoUnit.DAYS.between(this.dataAluguel, this.dataDevolucao);
		return (int) dias;
	}

}
