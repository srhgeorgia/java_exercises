package exerciciosClasses;

import java.util.Scanner;

public class principalLivro {
	public static void main(String[] args) {
		GerenciamentoLivro gerenciador = new GerenciamentoLivro();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Adicionar livro");
			System.out.println("2. Buscar livro por título");
			System.out.println("3. Exibir lista de livros");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); 

			switch (opcao) {
			case 1:
				System.out.print("Digite o título do livro: ");
				String titulo = scanner.nextLine();
				System.out.print("Digite o autor do livro: ");
				String autor = scanner.nextLine();
				gerenciador.adicionarLivro(titulo, autor);
				break;
			case 2:
				System.out.print("Digite o título do livro que deseja buscar: ");
				String tituloBusca = scanner.nextLine();
				gerenciador.buscarLivro(tituloBusca);
				break;
			case 3:
				gerenciador.listarLivros();
				break;
			case 0:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);

		scanner.close();
	}
}