package Jogo;

import java.util.Set;

import Exceptions.JogabilidadeInvalidaException;
import Exceptions.NomeInvalidoException;
import Exceptions.ValorInvalidoException;

public class RPG extends Jogo{
	
	private int ptx2p = 10;
	
	public RPG(String nome, double preco, Set<Jogabilidade> lista) throws NomeInvalidoException, ValorInvalidoException, JogabilidadeInvalidaException{
		super(nome, preco, lista);
	}
	
	@Override 
	public int registraJogada(int score, boolean concluiu) throws ValorInvalidoException{
		this.qtdJogadas ++;
		if(score <= 0){
			throw new ValorInvalidoException("Score invalido");
		}
		if(score > this.maxScore){
			this.maxScore = score;
		}
		if(concluiu){
			this.zerado ++;
		}
		return ptx2p;
	}
}
