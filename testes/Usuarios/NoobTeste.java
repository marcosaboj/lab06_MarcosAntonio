package Usuarios;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import Exceptions.NomeInvalidoException;
import Exceptions.SaldoInvalidoException;
import Exceptions.ValorInvalidoException;
import Jogo.Jogo;
import Usuario.Noob;
import Usuario.Usuario;

public class NoobTeste {
	
	private Usuario usuario;
	private Jogo jogo;
	private Set<String> lista;
	
	@Before
	public void criandoNoob() throws NomeInvalidoException{
		String nome = "jose";
		usuario = new Noob(nome);
		jogo = new Jogo("dota2", 3, lista, "rpg");
		lista = new HashSet<>();
		lista.add("Online");
		lista.add("Multiplayer");
		lista.add("Cooperativo");
	}
	
	@Test(expected = NomeInvalidoException.class)
	public void testConstrutor() throws NomeInvalidoException{
		Usuario usuario = new Noob("   ");
	}
	@Test(expected = Exception.class)
	public void testComprarJogofail() throws ValorInvalidoException, NomeInvalidoException, SaldoInvalidoException {
		Jogo jogo = new Jogo("dota", 5.3,  );
		usuario.comprarJogo(null);
	}

	/*@Test
	public void testNoob() {
		fail("Not yet implemented");
	}*/

}
