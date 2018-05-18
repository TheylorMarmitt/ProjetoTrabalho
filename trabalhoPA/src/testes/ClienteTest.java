package testes;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import principal.model.Cliente;

public class ClienteTest {
	
	@Test
	public void testaConstrutores() throws Exception {
		
		Cliente c = new Cliente(1,"Fulano",LocalDate.now(), "12345","12345","email@email.com", LocalDate.now(), "12345");
		
		assertEquals(Integer.valueOf(1), c.getCodigo());
		assertEquals("Fulano", c.getNome());
		assertEquals(LocalDate.now(), c.getDataNascimento());
		assertEquals(LocalDate.now(), c.getDataDeCadastro());
		assertEquals("12345", c.getCpf());
		assertEquals("12345", c.getCnh());
		assertEquals("email@email.com", c.getEmail());
		assertEquals("12345", c.getTelefone());
		
		
		
		Cliente c1 = new Cliente();
		c1.setCodigo(1);
		c1.setNome("Fulano");
		c1.setDataNascimento(LocalDate.now());
		c1.setDataDeCadastro(LocalDate.now());
		c1.setTelefone("12345");
		c1.setCpf("12345");
		c1.setEmail("email@email.com");
		c1.setCnh("12345");
		
		
	}
	
	@Test
	public void testaToString() throws Exception {
		Cliente c = new Cliente(1,"Fulano",LocalDate.now(), "12345","12345","email@email.com", LocalDate.now(), "12345");
		assertEquals("Fulano", c.toString());
	}
	
}
