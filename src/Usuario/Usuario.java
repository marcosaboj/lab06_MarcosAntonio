package Usuario;
import java.util.HashMap;
import java.util.Map;

import exceptions.NomeInvalidoException;
import exceptions.SaldoInvalidoException;
import exceptions.ValorInvalidoException;
import Jogo.Jogo;


public abstract class Usuario {
	protected String nome;
	protected Map<String, Jogo> jogos;
	protected int Saldo;
	protected int desconto;
	protected int x2p;
	
	public Usuario(String nome) throws NomeInvalidoException{
		if(!(nome.trim().equals("") || nome == null)){
			this.nome =  nome;
			this.jogos = new HashMap <>();
			this.Saldo = 0;
		}else{
			throw new NomeInvalidoException("Nome Vazio");
		}
	}
	
	public abstract void comprarJogo(String nome, int valor) throws ValorInvalidoException, NomeInvalidoException, SaldoInvalidoException;
	
	public void addSaldo(int valor) throws SaldoInvalidoException{
		if (valor > 0){
			Saldo += valor;
		}else{
			throw new SaldoInvalidoException("Valor Menor ou igual a 0");
		}
	}
	protected boolean addxp2(int valor, boolean veterano ){
		if(veterano && valor > 0){
			
		}else{
			
		}
		return false;
	}
	
}
