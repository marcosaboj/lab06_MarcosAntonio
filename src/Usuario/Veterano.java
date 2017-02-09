package Usuario;

public class Veterano extends Usuario{
	
	public Veterano(String nome) {
		super(nome);
		desconto = 20;
		x2p = 1000;
	}

	@Override
	public boolean comprarJogo(String nome, int valor) {
		// TODO Auto-generated method stub
		return false;
	}

}
