package principal.model;

public class AluguelBuilder {

	private Aluguel aluguel = new Aluguel();
	
	public AluguelBuilder setCodigo(Integer codigo) {
		aluguel.setCodigo(codigo);
		return this;
	}
	
	
}
