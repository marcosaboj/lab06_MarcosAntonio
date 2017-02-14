package Usuarios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.NomeInvalidoException;
import Usuario.Noob;
import Usuario.Usuario;

public class NoobTeste {
	@Before
	public void criandoNoob() throws NomeInvalidoException{
		String nome = "jose";
		Usuario usuario = new Noob(nome);
	}
	
	@Test(expected = NomeInvalidoException.class)
	public void testConstrutor() throws NomeInvalidoException{
		Usuario usuario = new Noob(" ");
	}
	@Test
	public void testComprarJogo() {
		fail("Not yet implemented");
	}

	@Test
	public void testNoob() {
		fail("Not yet implemented");
	}

}
