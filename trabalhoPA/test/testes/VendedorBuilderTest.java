package testes;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import principal.model.VendedorBuilder;

public class VendedorBuilderTest {
@Test
public void TestaVendedorBuilder() throws Exception {
	VendedorBuilder v = new VendedorBuilder();

	v.setCodigo(1);
	
	assertEquals(Integer.valueOf(1), v.getVendedor().getCodigo());
	
	v.setCpf("12345678910111");
	assertEquals("12345678910111", v.getVendedor().getCpf());
	
	v.setNome("Fulano");
	assertEquals("Fulano", v.getVendedor().getNome());
	
	v.setDataNascimento(LocalDate.now());
	assertEquals(LocalDate.now(), v.getVendedor().getDataNascimento());
	
	v.setEmail("email@email.com");
	assertEquals("email@email.com", v.getVendedor().getEmail());
	
	v.setTelefone("8291210");
	assertEquals("8291210", v.getVendedor().getTelefone());
	
	
	
	
	
}
}
