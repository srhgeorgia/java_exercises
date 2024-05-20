package exerciciosMatrizes;

import java.util.Scanner;

public class exercicio5 {
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

		// Calcular a média dos valores nas posições pares
		double soma = 0;
		int quantidade = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((i + j) % 2 == 0) { // Verificar se a soma dos índices é par
					soma += matriz[i][j];
					quantidade++;
				}
			}
		}

		// Calcular a média
		double media = soma / quantidade;

		// Exibir a matriz
		System.out.println("\nMatriz Informada:");
		exibirMatriz(matriz);

		// Exibir a média dos valores nas posições pares
		System.out.printf("\nMédia dos valores nas posições pares: %.2f\n", media);
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
