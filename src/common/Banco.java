package common;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> filaDeClientes;

	public Banco() {
		filaDeClientes = new ArrayList<Cliente>();
	}

	public void addCliente(Cliente cliente) {
		filaDeClientes.add(cliente);
	}

	public Cliente proximoDaFila(int nroCaixa) {
		Cliente cliente;
		if (nroCaixa > 0 && nroCaixa <= 5) {
			for (Cliente c : filaDeClientes) {
				if (c.getIdade() >= 65) {
					cliente = new Cliente(c.getNome(), c.getIdade());
					filaDeClientes.remove(c);
					return cliente;
				}
			}
		}
			cliente = new Cliente(filaDeClientes.get(0).getNome(), filaDeClientes.get(0).getIdade());
			filaDeClientes.remove(0);
			return cliente; 
	}
	
	public int getNumeroDePessoasNaFila() {
		return filaDeClientes.size();
	}
	
	public String getPessoasNaFila() {
		String fila = "";
		for (Cliente c : filaDeClientes) {
			fila += c.toString();
		}
		return fila;
	}
	
}
