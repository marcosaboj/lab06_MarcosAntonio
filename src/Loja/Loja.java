package Loja;

import java.util.HashMap;
import java.util.Map;

import Exceptions.JogoInvalidoException;
import Exceptions.LoginInvalidoException;
import Exceptions.NomeInvalidoException;
import Exceptions.SaldoInvalidoException;
import Exceptions.UsuarioInvalidoException;
import Exceptions.ValorInvalidoException;
import Jogo.Jogo;
import Usuario.Noob;
import Usuario.Usuario;
import Usuario.Veterano;

public class Loja {

	private Map<String, Usuario> usuarios = new HashMap<>();
	
	public void addUsuario(Usuario novo){
		try{
			if(novo == null){
				throw new UsuarioInvalidoException("Usuario Nulo");
			}else if(usuarios.containsKey(novo.getLogin())){
				throw new UsuarioInvalidoException("Usuario já Existe!");
			}else{
				usuarios.put(novo.getLogin(), novo);
			}
		}catch(UsuarioInvalidoException e){
			e.printStackTrace();
		}
	}
	public void addSaldo(String login, int valor){
		try{
			if(valor > 0){
				usuarios.get(login).addSaldo(valor);;
			}else{
				throw new ValorInvalidoException("Valor menor ou igual a zero");
			}
		}catch(SaldoInvalidoException e){
			e.printStackTrace();
		}catch(ValorInvalidoException e){
			e.printStackTrace();
		}
	}
	public void comprarJogo(String login, Jogo jogo){
		try{
			if(!(login.trim().equals("") || login == null)){
				usuarios.get(login).comprarJogo(jogo);
			}else{
				throw new UsuarioInvalidoException("Usuario não existe");
			}
		}catch(UsuarioInvalidoException e){
			e.printStackTrace();
		}catch(JogoInvalidoException e){
			e.printStackTrace();
		}
	}
	public void imprimirInfo(){
		System.out.println("=== Central P2-CG ===");
		for (Usuario usuario : usuarios.values()) {
			System.out.println(usuario.toString());
		} 
	}
	public boolean upgrade(String login){
		try{
			if(login.trim().equals("") || login == null){
				throw new UsuarioInvalidoException("Login Invalido");
			}else{
				if(usuarios.containsKey(login)){
					Object obj = usuarios.get(login);
					Usuario up = usuarios.get(login);
					
					if( up.getX2p() >= 1000){
						if(obj instanceof Noob){
							Usuario upgrade = new Veterano(up.getNome(), up.getLogin(), up.getJogos() ,up.getSaldo(), up.getX2p());
							usuarios.remove(login);
							usuarios.put(upgrade.getLogin(), upgrade);
							return usuarios.containsKey(upgrade.getLogin());
						}else{
							throw new UsuarioInvalidoException("O usuario ja é veterano ou é invalido");
						}
					}else{
						throw new UsuarioInvalidoException("O usuario não possui pontos suficientes para o upgrade");
					}
				}
			}
		}catch(UsuarioInvalidoException e){
			e.printStackTrace();
		}catch(NomeInvalidoException e){
			e.printStackTrace();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
		return false;
	}
}
