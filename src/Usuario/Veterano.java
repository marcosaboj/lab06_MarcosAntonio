package Usuario;

import java.util.Map;

import Exceptions.JogoInvalidoException;
import Exceptions.LoginInvalidoException;
import Exceptions.NomeInvalidoException;
import Jogo.Jogo;

public class Veterano extends Usuario{
	
	public Veterano(String nome, String login) throws NomeInvalidoException, LoginInvalidoException {
		super(nome, login);
		desconto = 0.20;
		x2p = 1000;
		ptX2PReal = 15;
	}
	public Veterano(String nome, String login,  Map<String, Jogo> jogos, double saldo, int x2p ) throws NomeInvalidoException, LoginInvalidoException{
		super(nome, login);
		desconto = 0.20;
		this.jogos = jogos;
		this.saldo = saldo;
		this.x2p = x2p;
		ptX2PReal = 15;
	}

	@Override
	public void comprarJogo(Jogo jogo) throws JogoInvalidoException {
		if(jogo == null){
			throw new JogoInvalidoException("Jogo nulo!");
		}else{
			if(jogo.getPreco() <= saldo){
				saldo -= jogo.getPreco() - (jogo.getPreco() * desconto);
				jogos.put(jogo.getNome(), jogo);
				x2p += (jogo.getPreco() * ptX2PReal);
			}
		}
	}

}
