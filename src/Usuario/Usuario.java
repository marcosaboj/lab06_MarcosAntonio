package Usuario;
import java.util.HashMap;
import java.util.Map;

import Exceptions.JogoInvalidoException;
import Exceptions.LoginInvalidoException;
import Exceptions.NomeInvalidoException;
import Exceptions.SaldoInvalidoException;
import Exceptions.ValorInvalidoException;
import Jogo.Jogo;


public abstract class Usuario {
	
	protected String nome;
	protected String login;
	protected Map<String, Jogo> jogos;
	protected double saldo;
	protected int ptX2PReal;
	protected double desconto;
	protected int x2p;
	
	public Usuario(String nome, String login) throws NomeInvalidoException, LoginInvalidoException{
		if(!(nome.trim().equals("") || nome == null)){
			this.nome =  nome;
			
			
		}else{
			throw new NomeInvalidoException("Nome Vazio");
		}
		if(!(login.trim().equals("") || login == null)){
			this.login = login;
		}else{
			throw new LoginInvalidoException("Login Vazio");
		}
		this.jogos = new HashMap <>();
		this.saldo = 0;
	}
	
	public abstract void comprarJogo(Jogo jogo) throws JogoInvalidoException;
	
	public void addSaldo(int valor) throws SaldoInvalidoException{
		if (valor > 0){
			saldo += valor;
		}else{
			throw new SaldoInvalidoException("Valor Menor ou igual a 0");
		}
	}
	public void registrarJogada(String nome, int score, boolean concluiu) throws ValorInvalidoException, NomeInvalidoException{
		if(nome.trim().equals("") || nome == null){
			throw new NomeInvalidoException("Nome de jogo invalido");
		}
		if(score <= 0){
			throw new ValorInvalidoException("Score invalido");
		}
		if(jogos.containsKey(nome)){
			x2p += jogos.get(nome).registraJogada(score, concluiu);
		}
	}
	public String getNome() {
		return this.nome;		
	}
	public Map<String, Jogo> getJogos() {
		return jogos;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getPtX2PReal() {
		return ptX2PReal;
	}

	public int getX2p() {
		return x2p;
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
