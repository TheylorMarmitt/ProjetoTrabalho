package principal.model;

import java.time.LocalDate;

public class VendedorBuilder {

	private Vendedor vendedor = new Vendedor();

	public VendedorBuilder setCodigo(Integer codigo) {
		vendedor.setCodigo(codigo);
		return this;
	}

	public VendedorBuilder setNome(String nome) {
		vendedor.setNome(nome);
		return this;
	}

	public VendedorBuilder setTelefone(String telefone) {
		vendedor.setTelefone(telefone);
		return this;
	}

	public VendedorBuilder setCpf(String cpf) {
		vendedor.setCpf(cpf);
		return this;
	}

	public VendedorBuilder setEmail(String email) {
		vendedor.setEmail(email);
		return this;
	}

	public VendedorBuilder setDataNascimento(LocalDate data) {
		vendedor.setDataNascimento(data);
		return this;
	}

	public Vendedor getVendedor() {
		return this.vendedor;
	}
}
