package Usuarios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.NomeInvalidoException;
import exceptions.SaldoInvalidoException;
import exceptions.ValorInvalidoException;
import Usuario.Noob;
import Usuario.Usuario;

public class NoobTeste {
	
	private Usuario usuario;
	
	@Before
	public void criandoNoob() throws NomeInvalidoException{
		String nome = "jose";
		usuario = new Noob(nome);
	}
	
	@Test(expected = NomeInvalidoException.class)
	public void testConstrutor() throws NomeInvalidoException{
		Usuario usuario = new Noob("   ");
	}
	@Test(expected = Exception.class)
	public void testComprarJogo() throws ValorInvalidoException, NomeInvalidoException, SaldoInvalidoException {
		usuario.comprarJogo("", -3);
	}

	/*@Test
	public void testNoob() {
		fail("Not yet implemented");
	}*/

}
