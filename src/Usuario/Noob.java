package Usuario;

import Exceptions.JogoInvalidoException;
import Exceptions.NomeInvalidoException;
import Jogo.Jogo;

public class Noob extends Usuario {
	
	public Noob(String nome) throws NomeInvalidoException {
		super(nome);
		desconto = 0.10;
		x2p = 0;
		ptX2PReal = 10;
		
	}

	@Override
	public void comprarJogo(Jogo jogo) throws JogoInvalidoException{
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
