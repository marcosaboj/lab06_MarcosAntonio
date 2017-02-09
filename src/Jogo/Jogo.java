package Jogo;

import java.util.HashSet;

public class Jogo {
	
	private String nome;
	private double preco;
	private int maxScore;
	private int qtdJogadas;
	private int zerado;
	private String tipo;
	private HashSet<Jogabilidade> jogabilidade;	
	
	public Jogo (String nome, double preco, String jogabilidade, String tipo){
		this.nome = nome;
		this.preco = preco;
		this.jogabilidade = new HashSet<Jogabilidade>();
		if(jogabilidade.equals("Online")){
			this.jogabilidade.add(Jogabilidade.ONLINE);
		}
		this.maxScore = 0;
		this.zerado = 0;
		this.qtdJogadas = 0;
	}
	
	public int registraJogada(int score, boolean concluiu){
		this.qtdJogadas ++;
		if(score > this.maxScore){
			this.maxScore = score;
		}
		if(concluiu){
			this.zerado ++;
		}
		return 0;
	}

}
