package Jogo;

import java.util.Set;

import Exceptions.JogabilidadeInvalidaException;
import Exceptions.NomeInvalidoException;
import Exceptions.ValorInvalidoException;
import Usuario.Usuario;

public abstract class Jogo {
	
	protected String nome;
	protected double preco;
	protected int maxScore;
	protected int qtdJogadas;
	protected int zerado;
	protected int x2p;
	protected Set<Jogabilidade> jogabilidade;
	
	public Jogo (String nome, double preco, Set<Jogabilidade> lista) throws NomeInvalidoException, ValorInvalidoException, JogabilidadeInvalidaException{
		
		if(nome.trim().equals("") || nome == null){
			throw new NomeInvalidoException("Nome invalido");
		}else{
			this.nome = nome;
		}
		if(preco <= 0){
			throw new ValorInvalidoException("Pre�o invalido");
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
	
	public abstract int registraJogada(int score, boolean concluiu) ;
	
	public double getPreco(){
		return this.preco;
	}
	public String getNome(){
		return this.nome;
	}
	
	@Override
	public abstract String toString();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Jogo))
			return false;
		Jogo novo = (Jogo) obj;
		return novo.getNome().equals(getNome());
	}
	
	

}
