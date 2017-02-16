package Usuario;

<<<<<<< HEAD
import Exceptions.NomeInvalidoException;
import Exceptions.SaldoInvalidoException;
import Exceptions.ValorInvalidoException;
import Jogo.Jogo;
=======
import exceptions.NomeInvalidoException;
import exceptions.SaldoInvalidoException;
import exceptions.ValorInvalidoException;
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1

public class Noob extends Usuario {
	
	public Noob(String nome) throws NomeInvalidoException {
		super(nome);
		desconto = 10;
		x2p = 0;
		
	}

	@Override
<<<<<<< HEAD
	public void comprarJogo(Jogo jogo) throws ValorInvalidoException, NomeInvalidoException, SaldoInvalidoException {
		if (jogo.getPreco() <= 0){
			throw new ValorInvalidoException("Valor menor ou igual a 0");
		}else if(this.Saldo >= jogo.getPreco()){
=======
	public void comprarJogo(String nome, int valor) throws ValorInvalidoException, NomeInvalidoException, SaldoInvalidoException {
		if (valor <= 0){
			throw new ValorInvalidoException("Valor menor ou igual a 0");
		}else if(nome.trim().equals("") || nome == null){
			throw new NomeInvalidoException("Nome Vazio");
		}else if(this.Saldo >= valor){
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1
			throw new SaldoInvalidoException("Saldo Insuficiente");
		}
	}

}
