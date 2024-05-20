package teste;

import java.util.Scanner;

public class Questao2 {

	public static Scanner sc = new Scanner(System.in);
	public static int quantidadeProdCadastrados = 0;

	public static int TAMANHO = 50;

	public static String[] vetorProdutos = new String[TAMANHO];
	public static double[] vetorPrecos = new double[TAMANHO];
	public static int[] vetorquantidadeProdCadastrados = new int[TAMANHO];

	public static void main(String[] args) {

		int opcao;
		do {
			exibirMenu();
			System.out.print("\nEscolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				exibirListaProdutos();
				break;
			case 2:
				adicionarProduto();
				break;
			case 3:
				analisarProdutos();
				break;
			case 4:
				removerProduto();
				break;
			case 5:
				atualizarEstoque();
				break;
			case 0:
				System.out.println("Saindo do programa. Até mais!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);
		sc.close();
	}

	// ===============EXIBIR MENU DE OPÇÕES NO DO=======================
	public static void exibirMenu() {
		System.out.println("\n===== MENU =====");
		System.out.println("1. Exibir lista de produtos");
		System.out.println("2. Adicionar produto");
		System.out.println("3. Analisar produtos");
		System.out.println("4. Remover produto");
		System.out.println("5. Atualizar estoque");
		System.out.println("0. Sair");
	}

	// ===============EXIBIR LISTA DE PRODUTOS=======================
	public static void exibirListaProdutos() {
		System.out.println("\n===== LISTA DE PRODUTOS =====");

		if (quantidadeProdCadastrados == 0) {
			System.out.println("Nenhum produto cadastrado ainda.");
			return;
		}

		for (int i = 0; i < quantidadeProdCadastrados; i++) {
			System.out.println("Produto: " + vetorProdutos[i] + ", Preço: " + vetorPrecos[i]
					+ ", quantidade em estoque: " + vetorquantidadeProdCadastrados[i]);
		}
	}

	// ===============ADICIONAR PRODUTOS=======================
	public static void adicionarProduto() {
		System.out.print("Digite o nome do produto: ");
		String nomeProduto = sc.nextLine();

		if (verSeProdutoJaExiste(nomeProduto)) {
			System.out.println("Produto já cadastrado. Não é possível adicionar o mesmo.");
			return;
		}

		System.out.print("Digite o preço do produto: ");
		double precoProduto = sc.nextDouble();
		
		System.out.print("Digite a quantidade do produto em estoque: ");
		int quantidadeProdCadastradosEstoque = sc.nextInt();

		vetorProdutos[quantidadeProdCadastrados] = nomeProduto;
		vetorPrecos[quantidadeProdCadastrados] = precoProduto;
		vetorquantidadeProdCadastrados[quantidadeProdCadastrados] = quantidadeProdCadastradosEstoque;

		quantidadeProdCadastrados++;

		System.out.println("Produto adicionado com sucesso!");
	}

	// ===============ANALISAR PRODUTOS=======================
	public static void analisarProdutos() {
		System.out.println("\n===== ANÁLISE DE PRODUTOS =====");
		System.out.println(
				"1. Quantidade de um produto ou a quantidade total de todos os produtos:");
		System.out.println("2. Preço total de um produto específico:");
		System.out.println("3. Preço total de todos os produtos:");

		int opcaoAnalise = sc.nextInt();
		
		switch (opcaoAnalise) {
		case 1:
			System.out.println("\nDigite o número da opção desejada:");
			System.out.println("1. quantidade de um produto:");
			System.out.println("2. quantidade total de todos os produtos:");
			int opcaoProd = sc.nextInt();
			
			if (opcaoProd == 1) {
				System.out.print("Digite o nome do produto: ");
				String produtoDesejado = sc.next();
				
				exibirQuantidadeDeUmProduto(produtoDesejado);
			} else if (opcaoProd == 2) {
				exibirQuantidadeDeTodosOsProdutos();
			} else {
				System.out.println("Opção inválida.");
			}
			break;
		case 2:
			System.out.print("Digite o nome do produto: ");
			String produtoPreco = sc.next();
			exibirPrecoTotalProduto(produtoPreco);
			break;
		case 3:
			exibirPrecoTotalTodosProdutos();
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}

	// ===============REMOVER UM PRODUTO=======================
	public static void removerProduto() {
		System.out.print("Digite o nome do produto que deseja remover: ");
		String produtoRemover = sc.next();
		int indiceProduto = indiceProdutoNoVetor(produtoRemover);
		
		if (indiceProduto != -1) {
			
			for (int i = indiceProduto; i < quantidadeProdCadastrados - 1; i++) {
				vetorProdutos[i] = vetorProdutos[i + 1];
				vetorPrecos[i] = vetorPrecos[i + 1];
				vetorquantidadeProdCadastrados[i] = vetorquantidadeProdCadastrados[i + 1];
			}
			
			quantidadeProdCadastrados--;
			System.out.println("Produto removido com sucesso!");
		} else {
			System.out.println("Produto não encontrado.");
		}
	}

	// ===============ATUALIZAR ESTOQUE=======================
	public static void atualizarEstoque() {
		System.out.println("\n===== ATUALIZAR ESTOQUE =====");
		System.out.println("1. Mudar preço de um produto específico e cadastrado:");
		System.out.println("2. Mudar a quantidadeProdCadastrados de um produto específico e cadastrado:");
		int opcaoAtualizar = sc.nextInt();
		
		switch (opcaoAtualizar) {
		case 1:
			System.out.print("Digite o nome do produto: ");
			String produtoPreco = sc.next();
			
			System.out.print("Digite o novo preço: ");
			double novoPreco = sc.nextDouble();
			
			atualizarPrecoProduto(produtoPreco, novoPreco);
			break;
		case 2:
			System.out.print("Digite o nome do produto: ");
			String produtoquantidadeProdCadastrados = sc.next();
			
			System.out.print("Digite a nova quantidadeProdCadastrados: ");
			int novaquantidadeProdCadastrados = sc.nextInt();
			
			atualizarQuantidadeProdCadastrados(produtoquantidadeProdCadastrados, novaquantidadeProdCadastrados);
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}

	// ===============ATUALIZAR PREÇO DO PRODUTO=======================
	public static void atualizarPrecoProduto(String nomeProduto, double novoPreco) {
		int indiceProduto = indiceProdutoNoVetor(nomeProduto);
		if (indiceProduto != -1) {
			vetorPrecos[indiceProduto] = novoPreco;
			System.out.println("Preço do produto atualizado com sucesso!");
		} else {
			System.out.println("Produto não encontrado.");
		}
	}

	
	// ===============ATUALIZA A QUANTIDADE DE PRODUTOS CADASTRADOS=======================
	public static void atualizarQuantidadeProdCadastrados(String nomeProduto,
		int novaquantidadeProdCadastrados) {
		int indiceProduto = indiceProdutoNoVetor(nomeProduto);
		if (indiceProduto != -1) {
			vetorquantidadeProdCadastrados[indiceProduto] = novaquantidadeProdCadastrados;
			System.out.println("Quantidade do produto atualizada com sucesso!");
		} else {
			System.out.println("Produto não encontrado.");
		}
	}

	
		
	
	// ===============EXIBIR QUANTIDADE DE PRODUTOS CADASTRADOS=======================
	public static void exibirQuantidadeDeUmProduto(String nomeProduto) {
		int indiceProduto = indiceProdutoNoVetor(nomeProduto);
		
		if (indiceProduto != -1) {
			System.out.println("Quantidade em estoque do " + nomeProduto + ": "
					+ vetorquantidadeProdCadastrados[indiceProduto]);
		} else {
			System.out.println("Produto não encontrado.");
		}
	}

	// ===============EXIBIR QUANTIDADE TOTAL DOS PRODUTOS NO ESTOQUE=======================
	public static void exibirQuantidadeDeTodosOsProdutos() {
		int quantidadeProdCadastradosTotal = 0;
		for (int i = 0; i < quantidadeProdCadastrados; i++) {
			quantidadeProdCadastradosTotal += vetorquantidadeProdCadastrados[i];
		}
		System.out.println("Quantidade de produtos total em estoque: " + quantidadeProdCadastradosTotal);
	}

	// ===============EXIBIR PREÇO TOTAL DO PRODUTO=======================
	public static void exibirPrecoTotalProduto(String nomeProduto) {
		int indiceProduto = indiceProdutoNoVetor(nomeProduto);
		if (indiceProduto != -1) {
			double precoTotal = vetorPrecos[indiceProduto] * vetorquantidadeProdCadastrados[indiceProduto];
			System.out.println("Preço total do " + nomeProduto + ": " + precoTotal);
		} else {
			System.out.println("Produto não encontrado.");
		}
	}

	// ===============EXIBIR PREÇO TOTAL DOS PRODUTOS=======================
	public static void exibirPrecoTotalTodosProdutos() {
		double precoTotalTodosProdutos = 0;
		for (int i = 0; i < quantidadeProdCadastrados; i++) {
			precoTotalTodosProdutos += vetorPrecos[i] * vetorquantidadeProdCadastrados[i];
		}
		System.out.println("Preço total de todos os produtos: " + precoTotalTodosProdutos);
	}

	// ===============VENDO SE O PRODUTO EXISTE=======================
	public static boolean verSeProdutoJaExiste(String nomeProduto) {
		for (int i = 0; i < quantidadeProdCadastrados; i++) {
			if (vetorProdutos[i].equalsIgnoreCase(nomeProduto)) {
				return true;
			}
		}
		return false;
	}

	// ===============PEGANDO INDICE DO PRODUTO=======================
	public static int indiceProdutoNoVetor(String nomeProduto) {
		for (int i = 0; i < quantidadeProdCadastrados; i++) {
			if (vetorProdutos[i].equalsIgnoreCase(nomeProduto)) {
				return i;
			}
		}
		return -1;
	}

}