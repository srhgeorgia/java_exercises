package exerciciosMatrizes;

import java.util.Scanner;

public class desafio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ler os valores M e N
		System.out.print("Digite o número de linhas (M): ");
		int M = sc.nextInt();

		System.out.print("Digite o número de colunas (N): ");
		int N = sc.nextInt();

		// Ler a matriz MxN
		int[][] matriz = new int[M][N];

		System.out.println("Digite os elementos da matriz:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		// Ler o número X
		System.out.print("Digite o número X: ");
		int X = sc.nextInt();

		// Procurar ocorrências de X na matriz
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (matriz[i][j] == X) {
					System.out.printf("Ocorrência de %d na posição [%d][%d]\n", X, i, j);
					exibirVizinhos(matriz, i, j);
					System.out.println(); // Adiciona uma linha em branco para separar as ocorrências
				}
			}
		}
		
		sc.close();
	}

	// Função para exibir vizinhos de uma posição na matriz
	private static void exibirVizinhos(int[][] matriz, int linha, int coluna) {
		int M = matriz.length;
		int N = matriz[0].length;

		// Vizinho à esquerda
		if (coluna > 0) {
			System.out.printf("À esquerda: %d\n", matriz[linha][coluna - 1]);
		}

		// Vizinho acima
		if (linha > 0) {
			System.out.printf("Acima: %d\n", matriz[linha - 1][coluna]);
		}

		// Vizinho à direita
		if (coluna < N - 1) {
			System.out.printf("À direita: %d\n", matriz[linha][coluna + 1]);
		}

		// Vizinho abaixo
		if (linha < M - 1) {
			System.out.printf("Abaixo: %d\n", matriz[linha + 1][coluna]);
		}
	}
}
