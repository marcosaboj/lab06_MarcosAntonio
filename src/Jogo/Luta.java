package Jogo;

import java.util.Set;

import Exceptions.JogabilidadeInvalidaException;
import Exceptions.NomeInvalidoException;
import Exceptions.ValorInvalidoException;

public class Luta extends Jogo {
	
	private int ptx2p = 0;
	
	public Luta (String nome, double preco, Set<Jogabilidade> lista) throws NomeInvalidoException, ValorInvalidoException, JogabilidadeInvalidaException{
		super(nome, preco, lista);
	}
	
	@Override 
	public int registraJogada(int score, boolean concluiu) {
		
		this.qtdJogadas ++;
		if(score > this.maxScore){
			this.maxScore = score;
			ptx2p = (score / 1000);
		}
		if(concluiu){
			this.zerado ++;
		}
		return ptx2p;
	}
	@Override
	public String toString(){
		String info = "";
		String pl = System.lineSeparator();
		info += "+ "+ this.nome +" - Luta:" + pl;
		info += "==> Jogou " + this.qtdJogadas + "vez(es)" + pl;
		info += "==> Zerou " + this.zerado + "vez(es)" + pl;
		info += "==> Maior score: " + this.maxScore + pl;
		return info;
	}
}
