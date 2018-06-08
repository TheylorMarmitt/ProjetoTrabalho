package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import principal.model.CarroBuilder;

public class CarroBuilderTest {

	@Test
	public void testaBuilder() throws Exception {
		
		CarroBuilder c = new CarroBuilder();
		
		c.setCodigo(1);
		assertEquals(Integer.valueOf(1), c.getCarro().getCodigo());
		
		c.setMarca("marca");
		assertEquals("marca", c.getCarro().getMarca());
		
		c.setModelo("modelo");
		assertEquals("modelo", c.getCarro().getModelo());
		
		c.setCor("cor");
		assertEquals("cor", c.getCarro().getCor());
		
		c.setAno(2000);
		assertEquals(Integer.valueOf(2000),c.getCarro().getAno());
		
		c.setDisponivel(true);
		assertEquals(true, c.getCarro().getDisponivel());
		
		c.setPlaca("abc1234");
		assertEquals("abc1234", c.getCarro().getPlaca());
		
		c.setValor(Double.valueOf(200));
		assertEquals(Double.valueOf(200), c.getCarro().getValor());
		
		
		
	}
}
