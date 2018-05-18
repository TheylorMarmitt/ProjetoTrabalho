package testes;

import static org.junit.Assert.assertEquals;

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

	
}
