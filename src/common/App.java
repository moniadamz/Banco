package common;

	import java.util.Scanner;

	public class App {


		private static Scanner ler;

		public static void main(String[] args) {
			Banco banco = new Banco();

			ler = new Scanner(System.in);

		
			int opcao;
			
			do {
				System.out.println("Opção 1 - Próximo da Fila");
				System.out.println("Opção 2 - Cadastrar Cliente");
				System.out.println("Opção 3 - Ver clientes na fila");
				System.out.println("Opção 4 - Encerra sistema");
				opcao = ler.nextInt();
				switch (opcao) {

				case 1:
					System.out.println("Informe o Numero do Caixa");
					int n = ler.nextInt();
					banco.proximoDaFila(n);
					
					break;
				case 2:
					System.out.println("Informe o nome: ");
					String nome = ler.next();
					System.out.println("Informe a idade: ");
					int idade = ler.nextInt();
					Cliente a = new Cliente(nome, idade);
					banco.addCliente(a);
					
					break;
				case 3:
					banco.getPessoasNaFila();
				
					break;
				}

			} while (opcao != 4);
		}

	}

