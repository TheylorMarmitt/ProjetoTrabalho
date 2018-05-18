package principal.model;

public class CarroBuilder {

	private Carro carro = new Carro();
	
	public CarroBuilder setCodigo(Integer codigo) {
		carro.setCodigo(codigo);
		return this;
	}
	
	public CarroBuilder setMarca(String marca) {
		carro.setMarca(marca);
		return this;
	}
	
	public CarroBuilder setModelo(String modelo) {
		carro.setModelo(modelo);
		return this;
	}
	
	public CarroBuilder setValor(Double valor) {
		carro.setValor(valor);
		return this;
	}
	
	public CarroBuilder setCor(String cor) {
		carro.setCor(cor);
		return this;
	}
	
	public CarroBuilder setPlaca(String placa) {
		carro.setPlaca(placa);
		return this;
	}
	
	public CarroBuilder setAno(Integer ano) {
		carro.setAno(ano);
		return this;
	}
	
	public CarroBuilder setDisponivel(Boolean disponivel) {
		carro.setDisponivel(disponivel);
		return this;
	}
	
	public Carro getCarro() {
		return this.carro;
	}
	
}
