package Usuarios;

import static org.junit.Assert.*;

<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import Exceptions.NomeInvalidoException;
import Exceptions.SaldoInvalidoException;
import Exceptions.ValorInvalidoException;
import Jogo.Jogo;
=======
import org.junit.Before;
import org.junit.Test;

import exceptions.NomeInvalidoException;
import exceptions.SaldoInvalidoException;
import exceptions.ValorInvalidoException;
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1
import Usuario.Noob;
import Usuario.Usuario;

public class NoobTeste {
	
	private Usuario usuario;
<<<<<<< HEAD
	private Jogo jogo;
	private Set<String> lista;
=======
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1
	
	@Before
	public void criandoNoob() throws NomeInvalidoException{
		String nome = "jose";
		usuario = new Noob(nome);
<<<<<<< HEAD
		jogo = new Jogo("dota2", 3, lista, "rpg");
		lista = new HashSet<>();
		lista.add("Online");
		lista.add("Multiplayer");
		lista.add("Cooperativo");
=======
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1
	}
	
	@Test(expected = NomeInvalidoException.class)
	public void testConstrutor() throws NomeInvalidoException{
		Usuario usuario = new Noob("   ");
	}
	@Test(expected = Exception.class)
<<<<<<< HEAD
	public void testComprarJogofail() throws ValorInvalidoException, NomeInvalidoException, SaldoInvalidoException {
		Jogo jogo = new Jogo("dota", 5.3,  );
		usuario.comprarJogo(null);
=======
	public void testComprarJogo() throws ValorInvalidoException, NomeInvalidoException, SaldoInvalidoException {
		usuario.comprarJogo("", -3);
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1
	}

	/*@Test
	public void testNoob() {
		fail("Not yet implemented");
	}*/

}
