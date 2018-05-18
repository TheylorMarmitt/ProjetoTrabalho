package principal.dao;

import principal.model.Filial;

public class FilialArquivo extends CrudArquivo<Filial> implements FilialDAO {
	
	public FilialArquivo(String nome) {
		super(nome);
	}
	
	public FilialArquivo() {
		super("Filial.ser");
	}
	
	
}
