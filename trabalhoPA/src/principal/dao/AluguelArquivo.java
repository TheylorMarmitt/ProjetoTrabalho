package principal.dao;

import principal.model.Aluguel;

public class AluguelArquivo extends CrudArquivo<Aluguel> implements AluguelDAO {
	
	@Override
	protected ManipuladorArquivo<Aluguel> criarManipulador() {
		return new ManipuladorArquivo<>("Aluguel.ser");
	}

}
