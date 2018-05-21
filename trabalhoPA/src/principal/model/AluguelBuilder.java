package principal.model;

import java.time.LocalDate;

public class AluguelBuilder {

	private Aluguel aluguel = new Aluguel();
	
	public AluguelBuilder setCodigo(Integer codigo) {
		aluguel.setCodigo(codigo);
		return this;
	}
	
	public AluguelBuilder setCarro(Carro carro) {
		aluguel.setCarro(carro);
		return this;
	}
	
	public AluguelBuilder setCliente(Cliente cliente) {
		aluguel.setCliente(cliente);
		return this;
	}
	
	public AluguelBuilder setFilial(Filial filial) {
		aluguel.setFilial(filial);
		return this;
	}
	
	public AluguelBuilder setVendedor(Vendedor vendedor) {
		aluguel.setVendedor(vendedor);
		return this;
	}
	
	public AluguelBuilder setDataAluguel(LocalDate data) {
		aluguel.setDataAluguel(data);
		return this;
	}
	
	public AluguelBuilder setDataDevolucao(LocalDate data) {
		aluguel.setDataDevolucao(data);
		return this;
	}
	
	public Aluguel getAluguel() {
		return this.aluguel;
	}
	
	
	
	
	
	
	
	
}
