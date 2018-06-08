package testes;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import principal.model.ClienteBuilder;

public class ClienteBuilderTest {

	@Test
	public void testaClienteBuilder() throws Exception {
		ClienteBuilder c = new ClienteBuilder();
		
		c.setCodigo(1);
		assertEquals(Integer.valueOf(1), c.getCliente().getCodigo());
		
		

		c.setNome("Fulano");
		assertEquals("Fulano", c.getCliente().getNome());
		

		c.setCnh("1234567");
		assertEquals("1234567", c.getCliente().getCnh());
		

		c.setCpf("12345678");
		assertEquals("12345678", c.getCliente().getCpf());
		

		c.setDataDeCadastro(LocalDate.now());
		assertEquals(LocalDate.now(), c.getCliente().getDataDeCadastro());
		
		
		c.setDataNascimento(LocalDate.now());
		assertEquals(LocalDate.now(), c.getCliente().getDataNascimento());
		
		
		c.setEmail("email@email.com");
		assertEquals("email@email.com", c.getCliente().getEmail());
		
		c.setTelefone("123456");
		assertEquals("123456", c.getCliente().getTelefone());
		
	}
	
	
	
}
