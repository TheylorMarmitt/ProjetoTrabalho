package testes;

import org.junit.Test;

import principal.dao.AluguelArquivo;
import principal.dao.AluguelDAO;

public class AluguelArquivoTest {

	
	@Test
	public void testaAluguelArquivo() throws Exception {
		AluguelDAO aluguelDao = new AluguelArquivo("teste.ser");
		
	}
}
