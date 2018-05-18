package testes;

import java.time.LocalDate;

import org.junit.Test;

import principal.dao.ClienteArquivo;
import principal.dao.ClienteDAO;
import principal.model.Cliente;

public class ClienteArquivoTest {
	
		@Test
		public void testaClienteArquivo() throws Exception {
			
			ClienteDAO ClienteDao = new ClienteArquivo("teste.ser");
			
			Cliente c = new Cliente();
			
			c.setCodigo(1);
			c.setNome("Fulano");
			c.setTelefone("123456789");
			c.setDataNascimento(LocalDate.now());
			c.setDataDeCadastro(LocalDate.now());
			c.setCnh("12345");
			c.setCpf("12345678910");
			c.setEmail("email@email.com");
			
			
			ClienteDao.inserir(c);
			ClienteDao.listar();
			ClienteDao.excluir(c);
			
			Cliente c1 = new Cliente();
			c1.setCodigo(1);
			c1.setNome("Fulano");
			c1.setTelefone("123456789");
			c1.setDataNascimento(LocalDate.now());
			c1.setDataDeCadastro(LocalDate.now());
			c1.setCnh("12345");
			c1.setCpf("12345678910");
			c1.setEmail("email@email.com");
			
			ClienteDao.inserir(c1);
			ClienteDao.alterar(c1);
		}
	}


