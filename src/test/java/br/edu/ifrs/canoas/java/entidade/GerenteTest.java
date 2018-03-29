package br.edu.ifrs.canoas.java.entidade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GerenteTest {

	private Gerente gerente;

	@Before
	public void setup() {
		gerente = new Gerente();
	}
	
	@Test
	public void testBonificacao() {
		gerente.setSalario(1000);
		assertEquals("Com o salario de 1000, a bonificacao eh 200 (20% do sal‡rio)", 
	                            200, gerente.getBonificacao(),0);
	}

	@Test
	public void testAutenticacao() {
		gerente.setSenha("123456");
		assertTrue("A senha do cliente eh 123456", gerente.autentica("123456"));
		
		gerente.setSenha("12345");
		assertFalse("A senha do gerente tem que ter 4 caracteres", gerente.autentica("12345"));
	}
	
}
