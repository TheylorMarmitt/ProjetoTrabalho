package principal.model;

public class FilialBuilder {

	private Filial filial = new Filial();
	
	public FilialBuilder setCodigo(Integer codigo) {
		filial.setCodigo(codigo);
		return this;
	}
	
	public FilialBuilder setCidade(String cidade) {
		filial.setCidade(cidade);
		return this;
	}
	
	
	public FilialBuilder setNome(String nome) {
		filial.setNome(nome);
		return this;
	}
	
	public FilialBuilder setUf(String uf) {
		filial.setUf(uf);
		return this;
	}
	

	public FilialBuilder setCnpj(String cnpj) {
		filial.setCnpj(cnpj);
		return this;
	}
	
	public Filial getFilial() {
		return this.filial;
	}
	
	
	
	
}
