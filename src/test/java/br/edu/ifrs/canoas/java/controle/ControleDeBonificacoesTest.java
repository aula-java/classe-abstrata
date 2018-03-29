package br.edu.ifrs.canoas.java.controle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifrs.canoas.java.entidade.Diretor;
import br.edu.ifrs.canoas.java.entidade.Funcionario;
import br.edu.ifrs.canoas.java.entidade.Gerente;
import br.edu.ifrs.canoas.java.entidade.Presidente;
import br.edu.ifrs.canoas.java.entidade.SecretariaAdministrativa;
import br.edu.ifrs.canoas.java.entidade.SecretariaAgencia;

public class ControleDeBonificacoesTest {

	ControleDeBonificacoes controle;
	Funcionario funcionario;

	@Before
	public void setup() {
		controle = new ControleDeBonificacoes();
	}

	@Test
	public void testPresidente() {
		funcionario = new Presidente();
		funcionario.setSalario(1000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus do presidente", 500,
				controle.getTotalDeBonificacoes(), 0);
		
		funcionario.setSalario(5000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus do presidente", 3000,
				controle.getTotalDeBonificacoes(), 0);

	}

	@Test
	public void testGerente() {
		funcionario = new Gerente();
		funcionario.setSalario(1000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus do gerente", 200,
				controle.getTotalDeBonificacoes(), 0);

		funcionario.setSalario(5000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus do gerente", 1200,
				controle.getTotalDeBonificacoes(), 0);

	}

	@Test
	public void testDiretor() {
		funcionario = new Diretor();
		funcionario.setSalario(1000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus do diretor", 100,
				controle.getTotalDeBonificacoes(), 0);
		
		funcionario.setSalario(5000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus do diretor", 600,
				controle.getTotalDeBonificacoes(), 0);
	}

	@Test
	public void testSecretariaAdministrativa() {
		funcionario = new SecretariaAdministrativa();
		funcionario.setSalario(1000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus da secretaria administrativa", 200,
				controle.getTotalDeBonificacoes(), 0);
		
		funcionario.setSalario(5000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus do diretor", 400,
				controle.getTotalDeBonificacoes(), 0);
		
		funcionario.setSalario(10000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus do diretor", 600,
				controle.getTotalDeBonificacoes(), 0);
		
	}

	@Test
	public void testSecretariaAgencia() {
		funcionario = new SecretariaAgencia();
		funcionario.setSalario(1000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus da secretaria agencia", 250,
				controle.getTotalDeBonificacoes(), 0);
		
		funcionario.setSalario(5000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus da secretaria agencia", 500,
				controle.getTotalDeBonificacoes(), 0);
		
		funcionario.setSalario(10000);
		controle.registra(funcionario);
		assertEquals("Valida o bonus da secretaria agencia", 750,
				controle.getTotalDeBonificacoes(), 0);
	}

}
