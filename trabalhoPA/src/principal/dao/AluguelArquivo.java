package principal.dao;

import principal.model.Aluguel;

public class AluguelArquivo extends CrudArquivo<Aluguel> implements AluguelDAO {

	public AluguelArquivo(String nome) {
		super(nome);
	}
	
	public AluguelArquivo() {
		super("aluguel.ser");
	}
	
}
