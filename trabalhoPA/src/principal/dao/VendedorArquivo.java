package principal.dao;

import principal.model.Vendedor;

public class VendedorArquivo extends CrudArquivo<Vendedor> implements VendedorDAO{
	
	public VendedorArquivo(String nome) {
		super(nome);
	}
	
	public VendedorArquivo() {
		super("vendedor.ser");
	}
	
}
