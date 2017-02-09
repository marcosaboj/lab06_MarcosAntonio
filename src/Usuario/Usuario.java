package Usuario;
import java.util.HashMap;
import java.util.Map;

import Jogo.Jogo;


public abstract class Usuario {
	protected String nome;
	protected Map<String, Jogo> jogos;
	protected int Saldo;
	protected int desconto;
	protected int x2p;
	
	public Usuario(String nome){
		this.nome =  nome;
		this.jogos = new HashMap <>();
		this.Saldo = 0;
	}
	
	public abstract boolean comprarJogo(String nome, int valor);
	
	public boolean addSaldo(int valor){
		if (valor > 0){
			Saldo += valor;
			return true;
		}
		return false;
	}
	protected boolean addxp2(int valor, boolean veterano ){
		if(veterano && valor > 0){
			
		}else{
			
		}
		return false;
	}
	
}
