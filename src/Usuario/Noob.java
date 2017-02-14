package Usuario;

import exceptions.NomeInvalidoException;
import exceptions.SaldoInvalidoException;
import exceptions.ValorInvalidoException;

public class Noob extends Usuario {
	
	public Noob(String nome) throws NomeInvalidoException {
		super(nome);
		desconto = 10;
		x2p = 0;
		
	}

	@Override
	public void comprarJogo(String nome, int valor) throws ValorInvalidoException, NomeInvalidoException, SaldoInvalidoException {
		if (valor <= 0){
			throw new ValorInvalidoException("Valor menor ou igual a 0");
		}else if(nome.trim().equals("") || nome == null){
			throw new NomeInvalidoException("Nome Vazio");
		}else if(this.Saldo >= valor){
			throw new SaldoInvalidoException("Saldo Insuficiente");
		}
	}

}
