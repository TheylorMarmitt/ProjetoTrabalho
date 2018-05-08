package principal.dao;

import principal.model.Carro;

public class CarroArquivo extends CrudArquivo<Carro> implements CarroDAO {
	
	@Override
	protected ManipuladorArquivo<Carro> criarManipulador() {
		return new ManipuladorArquivo<>("Carro.ser");
	}

}
