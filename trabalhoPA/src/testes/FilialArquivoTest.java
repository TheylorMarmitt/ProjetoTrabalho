package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import principal.dao.FilialArquivo;

public class FilialArquivoTest {

	@Test
	public void testaFilialArquivo() throws Exception {
		FilialArquivo fa = new FilialArquivo("nome");
		
		assertEquals("nome", fa.getClass());
	}
}
