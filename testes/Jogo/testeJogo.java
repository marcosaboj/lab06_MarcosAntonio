package Jogo;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import Exceptions.JogabilidadeInvalidaException;
import Exceptions.NomeInvalidoException;
import Exceptions.ValorInvalidoException;


public class testeJogo {
	
	@Before
	public void criarjogo() throws NomeInvalidoException, ValorInvalidoException, JogabilidadeInvalidaException{
		Set jogabilidade = new HashSet<Jogabilidade>();
		jogabilidade.add(Jogabilidade.ONLINE);
		jogabilidade.add(Jogabilidade.MULTIPLAYER);
		Jogo jogo = new Jogo("dota2", 9.99, jogabilidade, "RPG");
	}

	@Test
	public void testJogo() {
		fail("Not yet implemented");
	}

	@Test
	public void testRegistraJogada() {
		fail("Not yet implemented");
	}

}
