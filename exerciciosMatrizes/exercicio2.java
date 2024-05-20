package exerciciosMatrizes;

import java.util.Scanner;

public class exercicio2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicitar dimensões da primeira matriz
		System.out.print("Informe o número de linhas da primeira matriz: ");
		int linhas1 = sc.nextInt();

		System.out.print("Informe o número de colunas da primeira matriz: ");
		int colunas1 = sc.nextInt();

		// Solicitar dimensões da segunda matriz
		System.out.print("Informe o número de linhas da segunda matriz: ");
		int linhas2 = sc.nextInt();

		System.out.print("Informe o número de colunas da segunda matriz: ");
		int colunas2 = sc.nextInt();

		// Verificar se as matrizes podem ser multiplicadas
		if (colunas1 != linhas2) {
			System.out.println("As matrizes não podem ser multiplicadas. O programa será encerrado.");
			return;
		}

		// Criar e preencher a primeira matriz
		int[][] matriz1 = new int[linhas1][colunas1];
		System.out.println("\nPreencha a primeira matriz:");
		for (int i = 0; i < linhas1; i++) {
			for (int j = 0; j < colunas1; j++) {
				System.out.printf("Informe o elemento [%d][%d]: ", i, j);
				matriz1[i][j] = sc.nextInt();
			}
		}

		// Criar e preencher a segunda matriz
		int[][] matriz2 = new int[linhas2][colunas2];
		System.out.println("\nPreencha a segunda matriz:");
		for (int i = 0; i < linhas2; i++) {
			for (int j = 0; j < colunas2; j++) {
				System.out.printf("Informe o elemento [%d][%d]: ", i, j);
				matriz2[i][j] = sc.nextInt();
			}
		}

		// Realizar a multiplicação das matrizes
		int[][] resultadoMatriz = new int[linhas1][colunas2];
		for (int i = 0; i < linhas1; i++) {
			for (int j = 0; j < colunas2; j++) {
				for (int k = 0; k < colunas1; k++) {
					resultadoMatriz[i][j] += matriz1[i][k] * matriz2[k][j];
				}
			}
		}

		// Exibir as matrizes e a matriz resultante
		System.out.println("\nMatriz 1:");
		for (int i = 0; i < linhas1; i++) {
			for (int j = 0; j < colunas1; j++) {
				System.out.print(matriz1[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\nMatriz 2:");
		for (int i = 0; i < linhas2; i++) {
			for (int j = 0; j < colunas2; j++) {
				System.out.print(matriz2[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\nMultiplicação das Matrizes:");
		for (int i = 0; i < linhas1; i++) {
			for (int j = 0; j < colunas2; j++) {
				System.out.print(resultadoMatriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
