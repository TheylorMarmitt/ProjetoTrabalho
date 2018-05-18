package principal.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "codigo")
public class Filial implements Serializable {

	private static final long serialVersionUID = -6911788269286949660L;
	private Integer codigo;
	private String nome;
	private String cidade;
	private String uf;
	private String cnpj; // nao pode ser int, cnpj tem 14 caracteres numericos, int so permite ate 9

	public Filial() {
		super();

	}

	public Filial(Integer codigo, String nome, String cidade, String uf, String cnpj) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.uf = uf;
		this.cnpj = cnpj;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
