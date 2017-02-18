package Loja;

import java.util.HashMap;
import java.util.Map;

import Exceptions.JogoInvalidoException;
import Exceptions.SaldoInvalidoException;
import Exceptions.UsuarioInvalidoException;
import Exceptions.ValorInvalidoException;
import Jogo.Jogo;
import Usuario.Usuario;

public class Loja {

	private Map<String, Usuario> usuarios = new HashMap<>();
	
	public void addUsuario(Usuario novo) throws UsuarioInvalidoException{
		
		if(usuarios.containsKey(novo.getNome())){
			throw new UsuarioInvalidoException("Usuario já Existe!");
		}else{
			usuarios.put(novo.getNome(), novo);
		}
	}
	public void addSaldo(String usuario, int valor) throws SaldoInvalidoException, ValorInvalidoException{
		if(valor > 0){
			usuarios.get(usuario).addSaldo(valor);;
		}else{
			throw new ValorInvalidoException("Valor menor ou igual a zero");
		}
	}
	public void comprarJogo(String usuario, Jogo jogo) throws JogoInvalidoException, UsuarioInvalidoException{
		if(!(usuario.trim().equals("") || usuario == null)){
			usuarios.get(usuario).comprarJogo(jogo);
		}else{
			throw new UsuarioInvalidoException("Usuario não existe");
		}
	}
	public void imprimirInfo(){
		System.out.println("=== Central P2-CG ===");
		for (Usuario usuario : usuarios.values()) {
			System.out.println(usuario.toString());
		} 
	}
}
