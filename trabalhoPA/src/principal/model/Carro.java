package principal.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "codigo")
public class Carro implements Serializable {

	private static final long serialVersionUID = -2988664017936340351L;

	private Integer codigo;
	private String marca;
	private String modelo;
	private Double valor;
	private String cor;
	private Integer ano;
	private String placa;
	private Boolean disponivel;

	public Carro() {
		super();
	}

	public Carro(Integer codigo, String marca, String modelo, Double valor, String cor, Integer ano, String placa,
			Boolean disponivel) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.cor = cor;
		this.ano = ano;
		this.placa = placa;
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return this.modelo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
