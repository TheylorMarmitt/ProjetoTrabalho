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
		
	}
}
