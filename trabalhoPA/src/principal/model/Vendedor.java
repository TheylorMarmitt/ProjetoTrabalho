package principal.model;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "codigo")
public class Vendedor implements Serializable {

	private static final long serialVersionUID = 421404146292133091L;
	private Integer codigo;
	private String nome;
	private LocalDate dataNascimento;
	private String telefone;
	private String cpf;
	private String email;

	public Vendedor() {
		super();
	}

	public Vendedor(Integer codigo, String nome, LocalDate dataNascimento, String telefone, String cpf, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.cpf = cpf;
		this.email = email;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
