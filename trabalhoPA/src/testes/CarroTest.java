package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import principal.model.Carro;

public class CarroTest {

	@Test
	public void testaConstrutores() throws Exception {
		Carro c = new Carro(1, "marca","modelo", Double.valueOf(10),"cor", 2000, "abc1234",true);
		
		assertEquals(Integer.valueOf(1), c.getCodigo());
		assertEquals("marca", c.getMarca());
		assertEquals("modelo", c.getModelo());
		assertEquals(Double.valueOf(10), c.getValor());
		assertEquals("cor", c.getCor());
		assertEquals(Integer.valueOf(2000), c.getAno());
		assertEquals("abc1234", c.getPlaca());
		assertEquals(true, c.getDisponivel());
	
		
		Carro c1 = new Carro();
		c1.setCodigo(1);
		assertEquals(Integer.valueOf(1), c1.getCodigo());
		

		c1.setMarca("marca");
		assertEquals("marca", c1.getMarca());
		
		c1.setModelo("modelo");
		assertEquals("modelo", c1.getModelo());
		
		c1.setPlaca("abc1234");
		assertEquals("abc1234", c1.getPlaca());
		
		c1.setCor("cor");
		assertEquals("cor", c1.getCor());
		
		c1.setValor(Double.valueOf(10));
		assertEquals(Double.valueOf(10), c1.getValor());

		c1.setAno(2000);
		assertEquals(Integer.valueOf(2000), c1.getAno());
		
		c1.setDisponivel(true);
		assertEquals(true, c1.getDisponivel());
		
	}
	
	@Test
	public void testaToString() throws Exception {
		
		Carro c = new Carro(1, "marca","modelo", Double.valueOf(10),"cor", 2000, "abc1234",true);
		
		assertEquals("modelo", c.toString());
		
		
	}
	
	
}
