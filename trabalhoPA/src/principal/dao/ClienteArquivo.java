package principal.dao;

import principal.model.Cliente;

public class ClienteArquivo extends CrudArquivo<Cliente> implements ClienteDAO {
	
	@Override
	protected ManipuladorArquivo<Cliente> criarManipulador() {
		return new ManipuladorArquivo<>("cliente.ser");
	}

}
