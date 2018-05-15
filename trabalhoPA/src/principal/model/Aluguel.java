package principal.model;

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
public class Aluguel {

	private Integer codigo;
	private LocalDate dataAluguel;
	private LocalDate dataDevolucao;
	private Double taxaLocacao;
	private Carro carro;
	private Cliente cliente;
	private Vendedor vendedor;
	private Filial filial;
	
	private long dias;
	private long idade;

	public Integer diasLocacao() {
		dias = ChronoUnit.DAYS.between(this.dataAluguel, this.dataDevolucao);
		return (int) dias;
	}

}
