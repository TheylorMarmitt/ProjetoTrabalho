package principal.dao;

import principal.model.Filial;

public class FilialArquivo extends CrudArquivo<Filial> implements FilialDAO {
	
	@Override
	protected ManipuladorArquivo<Filial> criarManipulador() {
		return new ManipuladorArquivo<>("Filial.ser");
	}
}
