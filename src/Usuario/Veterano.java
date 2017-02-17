package Usuario;

import Exceptions.JogoInvalidoException;
import Exceptions.NomeInvalidoException;
import Jogo.Jogo;

public class Veterano extends Usuario{
	
	public Veterano(String nome) throws NomeInvalidoException {
		super(nome);
		desconto = 0.20;
		x2p = 1000;
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
