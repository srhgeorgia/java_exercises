package exerciciosFuncoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listapessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> listaPessoas = new ArrayList<>();

		int escolha;
		do {
			System.out.println("\nEscolha uma operação:");
			System.out.println("1. Listar Pessoas");
			System.out.println("2. Adicionar Pessoa");
			System.out.println("3. Modificar Pessoa");
			System.out.println("4. Remover Pessoa");
			System.out.println("0. Sair");

			escolha = sc.nextInt();
			sc.nextLine(); 

			switch (escolha) {
			case 1:
				listarPessoas(listaPessoas);
				break;
			case 2:
				adicionarPessoas(listaPessoas, sc);
				break;
			case 3:
				modificarPessoa(listaPessoas, sc);
				break;
			case 4:
				removerPessoa(listaPessoas, sc);
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

	public static void listarPessoas(List<String> pessoas) {
		System.out.println("\nUsuários: ");
		for (String pessoa : pessoas) {
			System.out.print(pessoa + " ");
		}
	}

	public static void adicionarPessoas(List<String> pessoas, Scanner sc) {
		int continuar;
		do {
			System.out.println("\nDigite o nome da pessoa a ser adicionada: ");
			String nome = sc.nextLine();
			pessoas.add(nome);
			System.out.println("Pessoa adicionada com sucesso!");

			System.out.println("\nDeseja adicionar outra pessoa? (1 para Sim / 0 para Não): ");
			continuar = sc.nextInt();
			sc.nextLine(); 
		} while (continuar == 1);

		listarPessoas(pessoas);
	}

	public static void modificarPessoa(List<String> pessoas, Scanner sc) {
		System.out.println("\nDigite o nome da pessoa a ser modificada: ");
		String nomeAntigo = sc.nextLine();

		if (pessoas.contains(nomeAntigo)) {
			System.out.println("\nDigite o novo nome: ");
			String novoNome = sc.nextLine();
			int index = pessoas.indexOf(nomeAntigo);
			pessoas.set(index, novoNome);
			System.out.println("Pessoa modificada com sucesso!");
		} else {
			System.out.println("Pessoa não encontrada. Não é possível modificar.");
		}

		listarPessoas(pessoas);
	}

	public static void removerPessoa(List<String> pessoas, Scanner sc) {
		System.out.println("\nDigite o nome da pessoa a ser removida: ");
		String nome = sc.nextLine();

		if (pessoas.contains(nome)) {
			pessoas.remove(nome);
			System.out.println("Pessoa removida com sucesso!");
		} else {
			System.out.println("Pessoa não encontrada. Não é possível remover.");
		}

		listarPessoas(pessoas);
	}
}
