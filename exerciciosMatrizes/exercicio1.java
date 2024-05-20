package exerciciosMatrizes;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicitar dimensões das matrizes
		System.out.print("Informe o número de linhas da matriz: ");
		int linhas = sc.nextInt();

		System.out.print("Informe o número de colunas da matriz: ");
		int colunas = sc.nextInt();

		// Criar e preencher a primeira matriz
		int[][] matriz1 = new int[linhas][colunas];
		System.out.println("\nPreencha a primeira matriz:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("Informe o elemento [%d][%d]: ", i, j);
				matriz1[i][j] = sc.nextInt();
			}
		}

		// Criar e preencher a segunda matriz
		int[][] matriz2 = new int[linhas][colunas];
		System.out.println("\nPreencha a segunda matriz:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("Informe o elemento [%d][%d]: ", i, j);
				matriz2[i][j] = sc.nextInt();
			}
		}

		// Realizar a soma das matrizes
		int[][] somaMatrizes = new int[linhas][colunas];
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		// Exibir as matrizes e a matriz resultante
		System.out.println("\nMatriz 1:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz1[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\nMatriz 2:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz2[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\nSoma das Matrizes:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(somaMatrizes[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();
	}
}
