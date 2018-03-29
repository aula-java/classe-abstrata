package br.edu.ifrs.canoas.java.controle;

import br.edu.ifrs.canoas.java.entidade.Cliente;
import br.edu.ifrs.canoas.java.entidade.Diretor;
import br.edu.ifrs.canoas.java.entidade.Gerente;

public class ControleDeAutenticacao {

	private static Diretor diretoresAutenticados[];
	private static Gerente gerentesAutenticados[];
	private static Cliente clientesAutenticados[];
	private int poolUsuarios;
	private static int contUsuarios;

	public ControleDeAutenticacao() {
		poolUsuarios = 100;

		ControleDeAutenticacao.contUsuarios = 0;

		diretoresAutenticados = new Diretor[poolUsuarios];
		gerentesAutenticados = new Gerente[poolUsuarios];
		clientesAutenticados = new Cliente[poolUsuarios];
	}

	public boolean login(Diretor funcionarioAutenticavel, String senha) {
		if (funcionarioAutenticavel.autentica(senha)) {
			diretoresAutenticados[ControleDeAutenticacao.contUsuarios++] = funcionarioAutenticavel;
			return true;
		}
		return false;
	}

	public boolean login(Gerente funcionarioAutenticavel, String senha) {
		if (funcionarioAutenticavel.autentica(senha)) {
			gerentesAutenticados[ControleDeAutenticacao.contUsuarios++] = funcionarioAutenticavel;
			return true;
		}
		return false;
	}

	public boolean login(Cliente clienteAutenticavel, String senha) {
		if (clienteAutenticavel.autentica(senha)) {
			clientesAutenticados[ControleDeAutenticacao.contUsuarios++] = clienteAutenticavel;
			return true;
		}
		return false;
	}
	
	public int getContUsuarios(){
		return ControleDeAutenticacao.contUsuarios;
	}

}
