package testes;

import java.time.LocalDate;

import org.junit.Test;

import principal.dao.VendedorArquivo;
import principal.dao.VendedorDAO;
import principal.model.Vendedor;

public class VendedorArquivoTest {
	@Test
	public void testaVendedorArquivo() throws Exception {
		
		VendedorDAO VendedorDao = new VendedorArquivo("teste.ser");
		
		Vendedor v = new Vendedor();
		
		v.setCodigo(1);
		v.setNome("Fulano");
		v.setTelefone("123456789");
		v.setDataNascimento(LocalDate.now());
		v.setCpf("12345678910");
		v.setEmail("email@email.com");
		
		
		VendedorDao.inserir(v);
		VendedorDao.listar();
		VendedorDao.excluir(v);
		
		Vendedor v1 = new Vendedor();
		v.setCodigo(1);
		v.setNome("Fulano");
		v.setTelefone("123456789");
		v.setDataNascimento(LocalDate.now());
		v.setCpf("12345678910");
		v.setEmail("email@email.com");
		
		VendedorDao.inserir(v1);
		VendedorDao.alterar(v1);
	}
}
