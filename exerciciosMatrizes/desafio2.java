package exerciciosMatrizes;

import java.util.Scanner;

public class desafio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Criar a matriz 4x4
		int[][] matriz = new int[4][4];

		// Preencher a matriz com valores fornecidos pelo usuário
		System.out.println("Digite os elementos da matriz 4x4:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		// Encontrar o maior valor e a posição correspondente
		int maiorValor = matriz[0][0];
		int linhaMaior = 0;
		int colunaMaior = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
			}
		}

		// Exibir o resultado
		System.out.println("\nMatriz Informada:");
		exibirMatriz(matriz);

		System.out.printf("\nO maior valor na matriz é %d, encontrado na posição [%d][%d].\n", maiorValor, linhaMaior,
				colunaMaior);
		
		sc.close();
	}

	// Função para exibir uma matriz
	private static void exibirMatriz(int[][] matriz) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
