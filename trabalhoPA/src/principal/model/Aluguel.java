package principal.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "codigo")
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

	public Aluguel() {
		super();
	}

	public Aluguel(Integer codigo, LocalDate dataAluguel, LocalDate dataDevolucao, Carro carro, Cliente cliente,
			Vendedor vendedor, Filial filial) {
		super();
		this.codigo = codigo;
		this.dataAluguel = dataAluguel;
		this.dataDevolucao = dataDevolucao;
		this.carro = carro;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.filial = filial;
	}

	public Integer diasLocacao() {
		long dias;
		dias = ChronoUnit.DAYS.between(this.dataAluguel, this.dataDevolucao);
		return (int) dias;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(LocalDate dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
