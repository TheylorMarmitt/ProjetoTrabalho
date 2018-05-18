package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import principal.model.FilialBuilder;

public class FilialBuilderTest {

	@Test
	public void testaFilialBuilder() throws Exception {
		
		FilialBuilder f = new FilialBuilder();
		
		f.setCidade("Xanxere");
		assertEquals("Xanxere", f.getFilial().getCidade());
		
		f.setUf("SC");
		assertEquals("SC", f.getFilial().getUf());
		
		f.setCodigo(Integer.valueOf(1));
		assertEquals(Integer.valueOf(1), f.getFilial().getCodigo());
		
		f.setNome("filial1");
		assertEquals("filial1", f.getFilial().getNome());
		
		f.setCnpj("192837192837");
		assertEquals("192837192837", f.getFilial().getCnpj());
		
		
		
	
		
	}
}
