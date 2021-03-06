package testes;

import org.junit.Test;

import principal.dao.FilialArquivo;
import principal.dao.FilialDAO;
import principal.model.Filial;

public class FilialArquivoTest {

	@Test
	public void testaFilialArquivo() throws Exception {
		FilialArquivo fa = new FilialArquivo("teste.ser");
		
		FilialDAO filialDao = new FilialArquivo("teste.ser");
		
		Filial f = new Filial();
		
		f.setCidade("xanxere");
		f.setCnpj("123");
		f.setCodigo(Integer.valueOf(1));
		f.setNome("fulano");
		f.setUf("SC");
		
		filialDao.inserir(f);
		filialDao.listar();
		filialDao.excluir(f);
		
		Filial f2 = new Filial();
		
		f2.setCidade("xanxere");
		f2.setCnpj("123");
		f2.setCodigo(Integer.valueOf(1));
		f2.setNome("fulano");
		f2.setUf("SC");
		
		filialDao.inserir(f2);
		filialDao.alterar(f);
	}
}
