package Usuario;

import Exceptions.NomeInvalidoException;
import Exceptions.SaldoInvalidoException;
import Exceptions.ValorInvalidoException;
import Jogo.Jogo;

public class Noob extends Usuario {
	
	public Noob(String nome) throws NomeInvalidoException {
		super(nome);
		desconto = 10;
		x2p = 0;
		
	}

	@Override
	public void comprarJogo(Jogo jogo) throws ValorInvalidoException, NomeInvalidoException, SaldoInvalidoException {
		if (jogo.getPreco() <= 0){
			throw new ValorInvalidoException("Valor menor ou igual a 0");
		}else if(this.Saldo >= jogo.getPreco()){
			throw new SaldoInvalidoException("Saldo Insuficiente");
		}
	}

}
