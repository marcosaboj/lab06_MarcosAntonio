package Jogo;

import java.util.HashSet;
<<<<<<< HEAD
import java.util.Set;

import Exceptions.JogabilidadeInvalidaException;
import Exceptions.NomeInvalidoException;
import Exceptions.ValorInvalidoException;
=======
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1

public class Jogo {
	
	private String nome;
	private double preco;
	private int maxScore;
	private int qtdJogadas;
	private int zerado;
	private String tipo;
<<<<<<< HEAD
	private Set<Jogabilidade> jogabilidade;
	
	public Jogo (String nome, double preco, Set<String> lista, String tipo) throws JogabilidadeInvalidaException, NomeInvalidoException, ValorInvalidoException{
		
		if(nome.trim().equals("") || nome == null){
			throw new NomeInvalidoException("Nome invalido");
		}else{
			this.nome = nome;
		}
		if(preco <= 0){
			throw new ValorInvalidoException("Preço invalido");
		}else{
			this.preco = preco;
		}
		this.jogabilidade = new HashSet<Jogabilidade>();
		for (String String : lista) {
			if(String.toUpperCase().equals("ONLINE")){
				this.jogabilidade.add(Jogabilidade.ONLINE);
			}else if(String.toUpperCase().equals("OFFLINE")){
				this.jogabilidade.add(Jogabilidade.OFFLINE);
			}else if(String.toUpperCase().equals("MULTIPLAYER")){
				this.jogabilidade.add(Jogabilidade.MULTIPLAYER);
			}else if(String.toUpperCase().equals("COOPERATIVO")){
				this.jogabilidade.add(Jogabilidade.COOPERATIVO);
			}else if(String.toUpperCase().equals("COMPETITIVO")){
				this.jogabilidade.add(Jogabilidade.COMPETITIVO);
			}else{
				throw new JogabilidadeInvalidaException("Jogabilidade não existe");
			}
=======
	private HashSet<Jogabilidade> jogabilidade;	
	
	public Jogo (String nome, double preco, String jogabilidade, String tipo){
		this.nome = nome;
		this.preco = preco;
		this.jogabilidade = new HashSet<Jogabilidade>();
		if(jogabilidade.equals("Online")){
			this.jogabilidade.add(Jogabilidade.ONLINE);
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1
		}
		this.maxScore = 0;
		this.zerado = 0;
		this.qtdJogadas = 0;
	}
	
<<<<<<< HEAD
	
	public int registraJogada(int score, boolean concluiu) throws ValorInvalidoException{
		this.qtdJogadas ++;
		if(score <= 0){
			throw new ValorInvalidoException("Score invalido");
		}
=======
	public int registraJogada(int score, boolean concluiu){
		this.qtdJogadas ++;
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1
		if(score > this.maxScore){
			this.maxScore = score;
		}
		if(concluiu){
			this.zerado ++;
		}
		return 0;
	}
<<<<<<< HEAD
	public double getPreco(){
		return this.preco;
	}
=======
>>>>>>> 5573b1c5b1c8b2a2cf2af8830fbd2fc9539bcae1

}
