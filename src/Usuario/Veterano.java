package Usuario;

<<<<<<< HEAD
import Exceptions.NomeInvalidoException;
=======
import exceptions.NomeInvalidoException;
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1

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
