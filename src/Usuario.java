import java.util.HashMap;
import java.util.Map;


public class Usuario {
	private String nome;
	private Map<String, Jogo> jogos;
	private int Saldo;
	
	public Usuario(String nome){
		this.nome =  nome;
		this.jogos = new HashMap <>();
		this.Saldo = 0;
	}
	
}
