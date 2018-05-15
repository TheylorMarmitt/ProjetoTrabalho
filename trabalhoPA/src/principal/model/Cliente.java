package principal.model;

import java.io.Serializable;
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
public class Cliente implements Serializable {


	private static final long serialVersionUID = 6156736837944291541L;
	private Integer codigo; 
	private String nome;
	private LocalDate dataNascimento;
	private String telefone;
	private String cpf;
	private String email;
	private LocalDate dataDeCadastro;
	private String cnh;
	
	
}
 