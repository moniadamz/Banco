package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import common.Cliente;

public class ClienteTest {
	
	@Test
	public void geracliente() {
		Cliente cliente = new Cliente("Amanda", 29);
		assertEquals("Nome: Amanda, 29", cliente.toString());
	}
	
	
}
