package exerciciosFuncoes;

import java.util.Scanner;

public class Operacoes {
	public static void listarPessoas(String[] pessoas) {
		System.out.println("\nUsuários: ");
		for (String pessoa : pessoas) {
			if (pessoa != null) {
				System.out.print(pessoa + " ");
			}
		}
	}

	public static int procuraPessoa(String[] pessoas, String nome) {
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null && pessoas[i].equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return -1;
	}

	public static void adicionarPessoas(String[] pessoas, Scanner sc) {
		int continuar;
		do {
			System.out.println("\nDigite o nome da pessoa a ser cadastrada: ");
			String nome = sc.nextLine();

			boolean adicionado = false;

			for (int i = 0; i < pessoas.length; i++) {
				if (pessoas[i] == null) {
					pessoas[i] = nome;
					adicionado = true;
					break;
				}
			}

			if (adicionado) {
				System.out.println("Pessoa adicionada com sucesso!");
			} else {
				System.out.println("Não foi possível adicionar a pessoa. A lista está cheia.");
			}

			System.out.println("\nDeseja adicionar outra pessoa? (1 para Sim / 0 para Não): ");
			continuar = sc.nextInt();
			sc.nextLine();
		} while (continuar == 1);

		listarPessoas(pessoas);
	}

	public static void modificarPessoas(String[] pessoas, Scanner sc) {
		listarPessoas(pessoas);
		System.out.println("\nDigite o nome do usuario a ser modificado: ");
		String nome = sc.nextLine();

		int procurarPessoa = procuraPessoa(pessoas, nome);

		if (procurarPessoa != -1) {
			System.err.println("Digite o novo nome: ");
			String novoNome = sc.nextLine();
			pessoas[procurarPessoa] = novoNome;
			System.out.println("Usuário modificado com sucesso!");
		} else {
			System.out.println("Usuário não encontrado");
		}
	}

	public static void removerPessoas(String[] pessoas, Scanner sc) {
		listarPessoas(pessoas);
		System.out.println("\nDigite o nome do usuario a ser removido: ");
		String nome = sc.nextLine();

		int procurarPessoa = procuraPessoa(pessoas, nome);

		if (procurarPessoa != -1) {
			pessoas[procurarPessoa] = null;
			System.out.println("Usuário removido com sucesso!");
		} else {
			System.out.println("Usuario nao encontrado");
		}
		listarPessoas(pessoas);
	}
}
