package Usuario;

import Exceptions.NomeInvalidoException;
import Jogo.Jogo;

public class Veterano extends Usuario{
	
	public Veterano(String nome) throws NomeInvalidoException {
		super(nome);
		desconto = 20;
		x2p = 1000;
	}

	@Override
	public void comprarJogo(Jogo jogo) {
		// TODO Auto-generated method stub
		
	}

}
