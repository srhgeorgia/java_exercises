package exerciciosMatrizes;

import java.util.Random;

public class exercicio4 {
	public static void main(String[] args) {
		int[][] matriz = gerarMatrizAleatoria(4, 4);

		System.out.println("Matriz Original:");
		exibirMatriz(matriz);

		int[][] transposta = transporMatriz(matriz);

		System.out.println("\nMatriz Transposta:");
		exibirMatriz(transposta);
	}

	// Função para gerar uma matriz aleatória com valores inteiros
	private static int[][] gerarMatrizAleatoria(int linhas, int colunas) {
		int[][] matriz = new int[linhas][colunas];
		Random random = new Random();

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = random.nextInt(100); // Valores inteiros entre 0 e 99
			}
		}

		return matriz;
	}

	// Função para exibir uma matriz
	private static void exibirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// Função para realizar a transposição de uma matriz
	private static int[][] transporMatriz(int[][] matriz) {
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		int[][] transposta = new int[colunas][linhas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				transposta[j][i] = matriz[i][j];
			}
		}

		return transposta;
	}
}
