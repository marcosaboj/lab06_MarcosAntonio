package Usuarios;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Exceptions.JogoInvalidoException;
import Exceptions.LoginInvalidoException;
import Exceptions.NomeInvalidoException;
import Exceptions.SaldoInvalidoException;
import Exceptions.ValorInvalidoException;
import Usuario.Usuario;
import Usuario.Veterano;

public class VeteranoTest {
	
	private Usuario usuario;
	
	@Before
	public void iniciando() throws NomeInvalidoException, LoginInvalidoException{
		usuario = new Veterano("José Ferreira", "jose.ferreira");
	}

	@Test
	public void testComprarJogo() {
		try{
			usuario.comprarJogo(null);
			Assert.fail("Excecao nao capturada");
		}catch(JogoInvalidoException e){
			Assert.assertEquals("Jogo nulo!", e.getMessage());
		}
	}

	@Test
	public void testVeterano() {
		try{
			Usuario teste = new Veterano("", "");
			Assert.fail("Excecao nao capturada");
		}catch(NomeInvalidoException e){
			Assert.assertEquals("Nome Vazio", e.getMessage());
		} catch (LoginInvalidoException e) {
			Assert.fail("Falha na captura da exceção Nome vazio");
			Assert.assertEquals("Login Vazio", e.getMessage());
		}
		try{
			Usuario teste = new Veterano("", "jose");
			Assert.fail("Excecao nao capturada");
		}catch(NomeInvalidoException e){
			Assert.assertEquals("Nome Vazio", e.getMessage());
		} catch (LoginInvalidoException e) {
			Assert.fail("Falha na captura da exceção Nome vazio");
		}
		try{
			Usuario teste = new Veterano("joaquim", "");
			Assert.fail("Excecao nao capturada");
		}catch(NomeInvalidoException e){
			Assert.fail("Falha na captura da exceção Login vazio");
		} catch (LoginInvalidoException e) {
			Assert.assertEquals("Login Vazio", e.getMessage());
		}
		try{
			Usuario teste = new Veterano("joaquim", "joaquim");
		}catch(LoginInvalidoException e){
			Assert.fail("Falha na captura da exceção Login vazio");
		} catch (NomeInvalidoException e) {
			Assert.assertEquals("Login Vazio", e.getMessage());
		}
	}

	@Test
	public void testAddSaldo() {
		try{
			usuario.addSaldo(0);
			Assert.fail("Excecao nao capturada");
		}catch(SaldoInvalidoException e){
			Assert.assertEquals("Valor Menor ou igual a 0", e.getMessage());
		}
		try{
			usuario.addSaldo(-2);
			Assert.fail("Excecao nao capturada");
		}catch(SaldoInvalidoException e){
			Assert.assertEquals("Valor Menor ou igual a 0", e.getMessage());
		}
		try{
			usuario.addSaldo(5);
		}catch(SaldoInvalidoException e){
			Assert.fail("Excecao capturada sem motivo");
		}
	}

	public void testRegistrarJogada() {
		try{
			usuario.registrarJogada("", 0, false);
			Assert.fail("Excecao nao capturada");
		}catch(NomeInvalidoException e){
			Assert.assertEquals("Nome de jogo invalido", e.getMessage());
		}catch(ValorInvalidoException e){
			Assert.fail("Excecao NomeInvalidoException nao capturada");
		}
		try{
			usuario.registrarJogada("dota2", 0, false);
			Assert.fail("Excecao nao capturada");
		}catch(NomeInvalidoException e){
			Assert.fail("Excecao ValorInvalidoException nao capturada");
		}catch(ValorInvalidoException e){
			Assert.assertEquals("Score invalido", e.getMessage());
		}
		try{
			usuario.registrarJogada("dota2", 4, false);
			
		}catch(NomeInvalidoException e){
			Assert.fail("Excecao capturada sem motivo");
		}catch(ValorInvalidoException e){
			Assert.fail("Excecao capturada sem motivo");
		}
	}
}