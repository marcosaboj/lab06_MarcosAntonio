package Jogo;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import Exceptions.JogabilidadeInvalidaException;
import Exceptions.NomeInvalidoException;
import Exceptions.ValorInvalidoException;

public class RPGTest {
	
	private Jogo jogo;
	private Set<Jogabilidade> jogabilidade;
	
	@Before
	public void iniciando() throws NomeInvalidoException, ValorInvalidoException, JogabilidadeInvalidaException{
		jogabilidade.add(Jogabilidade.ONLINE);
		jogabilidade.add(Jogabilidade.MULTIPLAYER);
		jogo = new RPG("dota2", 1.99, jogabilidade );
	}

	@Test
	public void testRegistraJogada() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testRPG() {
		try{
			Jogo dota = new RPG("", 1.99, null);
		}catch(NomeInvalidoException e){
			
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JogabilidadeInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testJogo() {
		fail("Not yet implemented");
	}

}
