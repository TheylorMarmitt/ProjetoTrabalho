package principal.dao;

import principal.model.Carro;

public class CarroArquivo extends CrudArquivo<Carro> implements CarroDAO {
	
	public CarroArquivo(String nome) {
		super(nome);
	}
	
	public CarroArquivo() {
		super("Carro.ser");
	}
	

}
