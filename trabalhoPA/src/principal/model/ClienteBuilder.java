package principal.model;

import java.time.LocalDate;

public class ClienteBuilder {
	
	private Cliente cliente = new Cliente();
	
	public ClienteBuilder setCodigo(Integer codigo) {
		cliente.setCodigo(codigo);
		return this;
	}
	
	public ClienteBuilder setNome(String nome) {
		cliente.setNome(nome);
		return this;
	}
	
	public ClienteBuilder setEmail(String email) {
		cliente.setEmail(email);
		return this;
	}
	
	public ClienteBuilder setTelefone(String telefone) {
		cliente.setTelefone(telefone);
		return this;
	}
	
	public ClienteBuilder setCpf(String cpf) {
		cliente.setCpf(cpf);
		return this;
	}
	
	public ClienteBuilder setCnh(String cnh) {
		cliente.setCnh(cnh);
		return this;
	}
	
	public ClienteBuilder setDataNascimento(LocalDate data) {
		cliente.setDataNascimento(data);
		return this;
	}
	
	public ClienteBuilder setDataDeCadastro(LocalDate data) {
		cliente.setDataDeCadastro(data);
		return this;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	
	
	

}
