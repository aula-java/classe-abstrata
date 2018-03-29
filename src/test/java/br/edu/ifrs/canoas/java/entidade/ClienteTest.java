package br.edu.ifrs.canoas.java.entidade;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

	private Cliente cliente;

	@Before
	public void setup() {
		cliente = new Cliente();
	}
	
	@Test
	public void testAutenticacao() {
		cliente.setSenha("1234");
		assertTrue("A senha do cliente eh 1234", cliente.autentica("1234"));
		
		cliente.setSenha("123");
		assertFalse("A senha do gerente tem que ter 4 caracteres", cliente.autentica("123"));
	}
	
}
