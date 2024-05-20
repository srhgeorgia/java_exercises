package exerciciosVetores;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para ser inserido: ");
		int valorInserido = sc.nextInt();

		int[] vetor = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 0 };
		int tamanhoDoVetor = vetor.length;

		System.out.println("Vetor original:");
		for (int i = 0; i < tamanhoDoVetor - 1; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println(" ");

		int posicaoAInserir = 0;

		// Encontrando a posição correta para inserir o novo valor mantendo a ordem
		// crescente
		while (posicaoAInserir < tamanhoDoVetor - 1 && valorInserido > vetor[posicaoAInserir]) {
			posicaoAInserir++;
		}

		// Deslocando os elementos para abrir espaço para o novo valor inserido
		for (int i = tamanhoDoVetor - 1; i > posicaoAInserir; i--) {
			// Deslocando o elemento para a posição à direita
			vetor[i] = vetor[i - 1];
		}

		// Inserindo o novo valor na posição correta
		vetor[posicaoAInserir] = valorInserido;

		System.out.println("\nNovo vetor após inserção: ");
		for (int i = 0; i < tamanhoDoVetor; i++) {
			System.out.print(vetor[i] + " ");
		}

		// Excluir um valor do vetor
		System.err.println(" ");
		System.out.println("\nDigite o valor a ser excluído: ");
		int valorExcluir = sc.nextInt();

		int posicaoExcluir = 0;

		// Encontrar a posição do valor a ser excluído
		while (posicaoExcluir < tamanhoDoVetor && valorExcluir != vetor[posicaoExcluir]) {
			// Avançando para a próxima posição
			posicaoExcluir++;
		}

		// Verificar se o valor a ser excluído foi encontrado
		if (posicaoExcluir == tamanhoDoVetor) {
			System.out.println("Valor não encontrado no vetor.");
		} else {
			// Deslocar os elementos para preencher a posição excluída
			for (int i = posicaoExcluir; i < tamanhoDoVetor - 1; i++) {
				// Deslocando o elemento para a posição à esquerda
				vetor[i] = vetor[i + 1];
			}

			// Preencher a última posição com 0
			vetor[tamanhoDoVetor - 1] = 0;

			System.err.println(" ");
			System.out.println("Novo vetor após exclusão:");
			for (int i = 0; i < tamanhoDoVetor; i++) {
				System.out.print(vetor[i] + " ");
			}
		}

		sc.close();
	}
}
