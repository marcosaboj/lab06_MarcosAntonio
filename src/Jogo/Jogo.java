package Jogo;

import java.util.Set;

import Exceptions.JogabilidadeInvalidaException;
import Exceptions.NomeInvalidoException;
import Exceptions.ValorInvalidoException;

public class Jogo {
	
	private String nome;
	private double preco;
	private int maxScore;
	private int qtdJogadas;
	private int zerado;
	private String tipo;
	private Set<Jogabilidade> jogabilidade;
	
	public Jogo (String nome, double preco, Set<Jogabilidade> lista, String tipo) throws NomeInvalidoException, ValorInvalidoException, JogabilidadeInvalidaException{
		
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
		if(lista == null){
			throw new JogabilidadeInvalidaException("Lista de Jogabilidades vazia");
		}else{
			this.jogabilidade = lista;
		}
		this.nome = nome;
		this.preco = preco;
		this.maxScore = 0;
		this.zerado = 0;
		this.qtdJogadas = 0;
	}
	
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
		return 0;
	}
	public double getPreco(){
		return this.preco;
	}
	public String getNome(){
		return this.nome;
	}

}
