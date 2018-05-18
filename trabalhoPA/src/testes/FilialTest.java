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
		f.setCidade("Xanxere");
		f.setCnpj("123456789");
		f.setCodigo(1);
		f.setNome("fulano");
		f.setUf("SC");
		//assertEquals(F, Filial(1, "fulano", "Xanxere", "SC", "123456789"));
		
	}
}
