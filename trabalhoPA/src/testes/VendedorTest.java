package testes;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import principal.model.Vendedor;

public class VendedorTest {

	@Test
	public void testaToString() throws Exception {
		Vendedor v = new Vendedor(1,"Fulano", LocalDate.now(),"12345","12345678910","email@email.com");
		
		assertEquals("Fulano", v.toString());
		
	}
	@Test
	public void testaConstrutores() throws Exception {
		Vendedor v = new Vendedor(1,"Fulano", LocalDate.now(),"12345","12345678910","email@email.com");
		assertEquals(Integer.valueOf(1), v.getCodigo());
		assertEquals("Fulano", v.getNome());
		assertEquals(LocalDate.now(), v.getDataNascimento());
		assertEquals("12345", v.getTelefone());
		assertEquals("12345678910", v.getCpf());
		assertEquals("email@email.com", v.getEmail());
		
		Vendedor v1 = new Vendedor();
		
		v1.setCodigo(1);
		assertEquals(Integer.valueOf(1), v1.getCodigo());
		
		v1.setNome("Fulano");
		assertEquals("Fulano", v1.getNome());
		
		v1.setTelefone("123456789");
		assertEquals("123456789", v1.getTelefone());
		
		v1.setDataNascimento(LocalDate.now());
		assertEquals(LocalDate.now(), v1.getDataNascimento());
		
		v1.setCpf("12345678910");
		assertEquals("12345678910", v1.getCpf());
		
		
		v1.setEmail("email@email.com");
		assertEquals("email@email.com", v1.getEmail());
		
			
				
		
		
		
		
		
	}
	
}
