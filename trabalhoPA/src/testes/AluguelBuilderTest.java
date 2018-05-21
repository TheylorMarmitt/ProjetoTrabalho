package testes;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import principal.model.AluguelBuilder;
import principal.model.Carro;
import principal.model.Cliente;
import principal.model.Filial;
import principal.model.Vendedor;

public class AluguelBuilderTest {

	@Test
	public void testaAluguelBuilder() throws Exception {
		
		AluguelBuilder a = new AluguelBuilder();
		Carro c = new Carro();
		Filial f = new Filial();
		Cliente cl = new Cliente();
		Vendedor v = new Vendedor();
		
		a.setCarro(c);
		assertEquals(c, a.getAluguel().getCarro());
		
		a.setCodigo(Integer.valueOf(1));
		assertEquals(Integer.valueOf(1), a.getAluguel().getCodigo());
		
		a.setDataAluguel(LocalDate.now());
		assertEquals(LocalDate.now(), a.getAluguel().getDataAluguel());
		
		a.setDataDevolucao(LocalDate.now());
		assertEquals(LocalDate.now(), a.getAluguel().getDataDevolucao());
		
		a.setFilial(f);
		assertEquals(f, a.getAluguel().getFilial());
		
		a.setVendedor(v);
		assertEquals(v, a.getAluguel().getVendedor());
		
		a.setCliente(cl);
		assertEquals(cl, a.getAluguel().getCliente());
		
		
	}
}
