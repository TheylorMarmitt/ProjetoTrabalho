package testes;

import org.junit.Test;

import principal.dao.CarroArquivo;
import principal.dao.CarroDAO;
import principal.model.Carro;

public class CarroArquivoTest {

	@Test
	public void testaCarroArquivo() throws Exception {

		CarroDAO CarroDao = new CarroArquivo("teste.ser");

		Carro c = new Carro();

		c.setCodigo(1);
		c.setMarca("marca");
		c.setAno(2000);
		c.setCor("cor");
		c.setModelo("modelo");
		c.setPlaca("abc1234");
		c.setValor(Double.valueOf(200));
		c.setDisponivel(true);

		CarroDao.inserir(c);
		CarroDao.listar();
		CarroDao.excluir(c);

		Carro c1 = new Carro();

		c1.setCodigo(1);
		c1.setMarca("marca");
		c1.setAno(2000);
		c1.setCor("cor");
		c1.setModelo("modelo");
		c1.setPlaca("abc1234");
		c1.setValor(Double.valueOf(200));
		c1.setDisponivel(true);

		CarroDao.inserir(c1);
		CarroDao.alterar(c1);
	}
}
