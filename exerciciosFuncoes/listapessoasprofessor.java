package exerciciosFuncoes;

import java.util.Scanner;

public class listapessoasprofessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] listaPessoas = { "Fabio", "Julio", "Cesar", "Maria", "Isabela", null };

		int escolha;
		do {
			System.out.println("\n\nEscolha uma operação:");
			System.out.println("1. Listar Pessoas");
			System.out.println("2. Adicionar Pessoa");
			System.out.println("3. Modificar Pessoa");
			System.out.println("4. Remover Pessoa");
			System.out.println("0. Sair");

			escolha = sc.nextInt();
			sc.nextLine();

			switch (escolha) {
			case 1:
				Operacoes.listarPessoas(listaPessoas);
				break;
			case 2:
				Operacoes.adicionarPessoas(listaPessoas, sc);
				break;
			case 3:
				Operacoes.modificarPessoas(listaPessoas, sc);
				break;
			case 4:
				Operacoes.removerPessoas(listaPessoas, sc);
				break;
			case 0:
				System.out.println("Saindo do programa. Até logo!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (escolha != 0);

		sc.close();
	}

}
