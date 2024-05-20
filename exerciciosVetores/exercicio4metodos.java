package exerciciosVetores;

import java.util.Scanner;

public class exercicio4metodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para ser inserido: ");
		int valorInserido = sc.nextInt();

		int[] vetor = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 0 };
		int tamanhoDoVetor = vetor.length;

		int posicaoAInserir = 0;

		System.out.println("Vetor original:");
		exibirVetor(vetor);

		// Encontrando a posição correta para inserir o novo valor mantendo a ordem
		// crescente
		encontrarPosicao(vetor, valorInserido, posicaoAInserir);

		// Deslocando os elementos para abrir espaço para o novo valor inserido
		deslocarElementosParaInserir(vetor, posicaoAInserir);

		// Inserindo o novo valor na posição correta
		vetor[posicaoAInserir] = valorInserido;

		System.out.println("\nNovo vetor ordenado: ");
		exibirVetor(vetor);

		// Excluir um valor do vetor
		System.out.println("\nDigite o valor a ser excluído: ");
		int valorExcluir = sc.nextInt();

		int posicaoExcluir = 0;

		// Encontrar a posição do valor a ser excluído
		encontrarPosicao(vetor, valorExcluir, posicaoExcluir);

		// Verificar se o valor a ser excluído foi encontrado
		if (posicaoExcluir == tamanhoDoVetor) {
			System.out.println("Valor não encontrado no vetor.");
		} else {
			// Deslocar os elementos para preencher a posição excluída
			deslocarElementosParaExcluir(vetor, posicaoExcluir);

			// Preencher a última posição com 0
			vetor[tamanhoDoVetor - 1] = 0;

			System.err.println(" ");
			System.out.println("\nNovo vetor após exclusão: ");
			exibirVetor(vetor);
		}

		sc.close();
	}

	public static void exibirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}

	public static void encontrarPosicao(int[] vetor, int valor, int posicao) {
		while (posicao < vetor.length - 1 && valor > vetor[posicao]) {
			posicao++;
		}
	}

	public static void deslocarElementosParaInserir(int[] vetor, int posicao) {
		for (int i = vetor.length - 1; i > posicao; i--) {
			vetor[i] = vetor[i - 1];
		}
	}

	public static void deslocarElementosParaExcluir(int[] vetor, int posicao) {
		for (int i = posicao; i < vetor.length - 1; i++) {
			vetor[i] = vetor[i + 1];
		}
	}
}
