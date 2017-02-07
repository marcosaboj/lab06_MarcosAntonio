
public class Jogo {
	
	private String nome;
	private double preco;
	private int maxScore;
	private int qtdJogadas;
	private int zerado;
	private String Jogabilidade;
	
	public Jogo (String nome, double preco, String Jogabilidade){
		this.nome = nome;
		this.preco = preco;
		this.Jogabilidade = Jogabilidade;
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
