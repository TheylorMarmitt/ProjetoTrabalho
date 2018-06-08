package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import principal.model.Filial;

public class FilialTest {

	@Test
	public void deveRetornarToStringComNome() throws Exception {
		Filial f = new Filial();
		f.setNome("Fulano");
		assertEquals("Fulano", f.toString());
	}
	
	@Test
	public void construtorTest() throws Exception {
		Filial f = new Filial(1,"nome", "xanxere", "Sc", "1234567899");
		assertEquals(Integer.valueOf(1), f.getCodigo());
		assertEquals("nome", f.getNome());
		assertEquals("xanxere", f.getCidade());
		assertEquals("Sc", f.getUf());
		assertEquals("1234567899", f.getCnpj());
		

	}
	
	@Test
	public void testEquals() throws Exception {
		Filial f = new Filial();
		
		f.setCidade("xanxere");
		f.setCnpj("1234567899");
		f.setCodigo(1);
		f.setNome("nome");
		f.setUf("Sc");
		
		Filial f1 = new Filial(1,"nome", "xanxere", "Sc", "1234567899");
		
		assertEquals(f, f1);	
		
		assertTrue(f.hashCode() == f1.hashCode());
				
		f1.setCodigo(2);
		
		assertFalse(f.equals(f1));
		assertFalse(f.hashCode() == f1.hashCode());
		assertFalse(f.equals("STRING"));
	}

	
}
