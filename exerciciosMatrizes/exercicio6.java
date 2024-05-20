package exerciciosMatrizes;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		// Preencher a matriz
		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		// Calcular a soma da diagonal principal
		int somaDiagonalPrincipal = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagonalPrincipal += matriz[i][i];
		}

		// Exibir a matriz
		System.out.println("\nMatriz Informada:");
		exibirMatriz(matriz);

		// Exibir a soma da diagonal principal
		System.out.printf("\nSoma da Diagonal Principal: %d\n", somaDiagonalPrincipal);

		sc.close();
	}

	// Função para exibir uma matriz
	private static void exibirMatriz(int[][] matriz) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
