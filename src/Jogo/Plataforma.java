package Jogo;

import java.util.Set;

import Exceptions.JogabilidadeInvalidaException;
import Exceptions.NomeInvalidoException;
import Exceptions.ValorInvalidoException;

public class Plataforma extends Jogo {
	
	private int ptx2p = 20;
	
	public Plataforma (String nome, double preco, Set<Jogabilidade> lista) throws NomeInvalidoException, ValorInvalidoException, JogabilidadeInvalidaException{
		super(nome, preco, lista);
	}
	
	@Override 
	public int registraJogada(int score, boolean concluiu) throws ValorInvalidoException{

		if(score <= 0){
			throw new ValorInvalidoException("Score invalido");
		}
		this.qtdJogadas ++;
		if(score > this.maxScore){
			this.maxScore = score;
		}
		if(concluiu){
			this.zerado ++;
			return ptx2p;
		}
		return 0;
	}
	@Override
	public String toString(){
		String info = "";
		String pl = System.lineSeparator();
		info += "+ "+ this.nome +" - Plataforma:" + pl;
		info += "==> Jogou " + this.qtdJogadas + "vez(es)" + pl;
		info += "==> Zerou " + this.zerado + "vez(es)" + pl;
		info += "==> Maior score: " + this.maxScore + pl;
		return info;
	}
}
