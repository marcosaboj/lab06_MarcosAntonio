package Usuario;
import java.util.HashMap;
import java.util.Map;

import Exceptions.JogoInvalidoException;
import Exceptions.NomeInvalidoException;
import Exceptions.SaldoInvalidoException;
import Exceptions.ValorInvalidoException;
import Jogo.Jogo;


public abstract class Usuario {
	
	protected String nome;
	protected String login;
	protected Map<String, Jogo> jogos;
	protected int saldo;
	protected int ptX2PReal;
	protected double desconto;
	protected int x2p;
	
	public Usuario(String nome) throws NomeInvalidoException{
		if(!(nome.trim().equals("") || nome == null)){
			this.nome =  nome;
			this.jogos = new HashMap <>();
			this.saldo = 0;
		}else{
			throw new NomeInvalidoException("Nome Vazio");
		}
	}
	
	public abstract void comprarJogo(Jogo jogo) throws JogoInvalidoException;
	
	public void addSaldo(int valor) throws SaldoInvalidoException{
		if (valor > 0){
			saldo += valor;
		}else{
			throw new SaldoInvalidoException("Valor Menor ou igual a 0");
		}
	}
	public void registrarJogada(String nome, int score, boolean concluiu) throws ValorInvalidoException{
		if(jogos.containsKey(nome)){
			x2p += jogos.get(nome).registraJogada(score, concluiu);
		}
	}
	protected boolean addxp2(int valor, boolean veterano ){
		if(veterano && valor > 0){
			
		}else{
			
		}
		return false;
	}
	public String getNome() {
		return this.nome;		
	}
	public String getLogin(){
		return this.login;
	}
	
	@Override
	public String toString(){
		String info = "";
		double totalPreco = 0;
		String pl = System.lineSeparator();
		info += this.getLogin() + pl;
		info += this.getNome() + " - " + "Jogador Noob" + pl;
		info += "Lista de Jogos:" + pl;
		for (Jogo jogo : jogos.values()) {
			info += jogo.toString();
			totalPreco += jogo.getPreco();
		}
		info += "Total de preço dos jogos: R$ " + totalPreco + pl;
		info += "--------------------------------------------";
		return info;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Usuario))
			return false;
		Usuario novo = (Usuario) obj;
		return novo.getLogin().equals(getLogin());
	}
}
