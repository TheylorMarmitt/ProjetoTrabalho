package principal.dao;

import principal.model.Vendedor;

public class VendedorArquivo extends CrudArquivo<Vendedor> implements VendedorDAO{
	
	@Override
	protected ManipuladorArquivo<Vendedor> criarManipulador() {
		return new ManipuladorArquivo<>("vendedor.ser");
	}
}
