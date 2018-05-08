package principal.model;

import java.time.LocalDate;

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
public class Vendedor {

	private Integer codigo; 
	private String nome;
	private LocalDate dataNascimento;
	private String telefone;
	private String cpf;
	private String email;
	private LocalDate dataDeAdmissao;
	private LocalDate dataDeDemissao;
	
}
