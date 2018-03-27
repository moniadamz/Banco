package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import common.Banco;
import common.Cliente;

public class BancoTest {

	@Test
	public void addCliente() {
		Banco banco = new Banco();
		banco.addCliente(new Cliente("Monica", 23));
		assertEquals(1, banco.getNumeroDePessoasNaFila());
	}
	
	@Test
	public void getPessoasNaFila() {
		Banco banco = new Banco();
		banco.addCliente(new Cliente("Monica", 23));
		assertEquals("Nome: Monica, 23", banco.getPessoasNaFila());
	}
	
	@Test
	public void proximoDaFilaIdoso() {
		Banco banco = new Banco();
		banco.addCliente(new Cliente("Monica", 23));
		banco.addCliente(new Cliente("Amanda", 42));
		banco.addCliente(new Cliente("Julio", 65));
		banco.addCliente(new Cliente("Antonio", 18));
		banco.addCliente(new Cliente("Roberta", 31));
		assertEquals("Nome: Julio, 65", banco.proximoDaFila(4).toString());
	}
	
	@Test
	public void proximoDaFila() {
		Banco banco = new Banco();
		banco.addCliente(new Cliente("Monica", 23));
		banco.addCliente(new Cliente("Amanda", 42));
		banco.addCliente(new Cliente("Julio", 65));
		banco.addCliente(new Cliente("Antonio", 18));
		banco.addCliente(new Cliente("Roberta", 31));
		assertEquals("Nome: Monica, 23", banco.proximoDaFila(6).toString());
	}
	
}
