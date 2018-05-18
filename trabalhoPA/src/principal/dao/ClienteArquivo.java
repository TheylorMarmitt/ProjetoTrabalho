package principal.dao;

import principal.model.Cliente;

public class ClienteArquivo extends CrudArquivo<Cliente> implements ClienteDAO {
	
	public ClienteArquivo(String nome) {
		super(nome);
	}
	
	public ClienteArquivo() {
		super("cliente.ser");
	}
	

}
