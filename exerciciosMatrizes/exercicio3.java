package exerciciosMatrizes;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicitar dimensões da matriz
		System.out.print("Informe o número de linhas da matriz: ");
		int linhas = sc.nextInt();

		System.out.print("Informe o número de colunas da matriz: ");
		int colunas = sc.nextInt();

		// Criar e preencher a matriz
		int[][] matriz = new int[linhas][colunas];
		System.out.println("\nPreencha a matriz:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("Informe o elemento [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		// Realizar a transposição da matriz
		int[][] matrizTransposta = new int[colunas][linhas];
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}

		// Exibir a matriz original
		System.out.println("\nMatriz Original:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		// Exibir a matriz transposta
		System.out.println("\nMatriz Transposta:");
		for (int i = 0; i < colunas; i++) {
			for (int j = 0; j < linhas; j++) {
				System.out.print(matrizTransposta[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
