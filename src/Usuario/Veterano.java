package Usuario;

import Exceptions.NomeInvalidoException;

public class Veterano extends Usuario{
	
	public Veterano(String nome) throws NomeInvalidoException {
		super(nome);
		desconto = 20;
		x2p = 1000;
	}

	@Override
	public void comprarJogo(String nome, int valor) {
		// TODO Auto-generated method stub
		
	}

}
