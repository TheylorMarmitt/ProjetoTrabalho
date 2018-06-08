package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import principal.model.Aluguel;
import principal.model.Carro;
import principal.model.Cliente;
import principal.model.Filial;
import principal.model.Vendedor;

public class AluguelTest {
	
	@Test
	public void testaClasseAluguel() throws Exception {
		Carro c = new Carro();
		c.setMarca("marca1");
		Cliente cl = new Cliente();
		Vendedor v = new Vendedor();
		Filial f = new Filial();
		Aluguel a = new Aluguel(Integer.valueOf(1), LocalDate.now(), LocalDate.now(), c, cl, v, f);
		
		Aluguel a1 = new Aluguel();
		
		a1.setCodigo(Integer.valueOf(1));
		a1.setDataDevolucao(LocalDate.now());
		a1.setDataAluguel(LocalDate.now());
		a1.setFilial(f);
		a1.setCarro(c);
		a1.setCliente(cl);
		a1.setVendedor(v);
		
		a1.equals(a);
		
		assertEquals(f, a1.getFilial());
		assertEquals(Integer.valueOf(1), a1.getCodigo());
		assertEquals(LocalDate.now(), a1.getDataAluguel());
		assertEquals(LocalDate.now(), a1.getDataDevolucao());
		assertEquals(c, a1.getCarro());
		assertEquals(cl, a1.getCliente());
		assertEquals(v, a1.getVendedor());
		
		assertEquals(Integer.valueOf(1), a1.diasLocacao());
		
		assertEquals(a, a1);	
		
		assertTrue(a.hashCode() == a1.hashCode());
				
		a1.setCodigo(2);
	
		assertFalse(v.equals(a1));
		assertFalse(v.hashCode() == a1.hashCode());
		assertFalse(v.equals("STRING"));
		
	}

}
