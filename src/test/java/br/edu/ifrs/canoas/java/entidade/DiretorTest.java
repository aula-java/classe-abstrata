package br.edu.ifrs.canoas.java.entidade;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class DiretorTest {

	private Diretor diretor;

	@Before
	public void setup() {
		diretor = new Diretor();
	}

	@Test
	public void testBonificacao() {
		diretor.setSalario(1000);
		assertEquals("Com o salario de 1000, a bonificacao eh 100 (10% do sal‡rio)", 
	                            100, diretor.getBonificacao(),0);
	}

	@Test
	public void testAutenticacao() {
		diretor.setSenha("12345678");
		assertTrue("A senha do cliente eh 12345678", diretor.autentica("12345678"));
		
		diretor.setSenha("1234567");
		assertFalse("A senha do gerente tem que ter 8 caracteres", diretor.autentica("1234567"));
	}

	
}
