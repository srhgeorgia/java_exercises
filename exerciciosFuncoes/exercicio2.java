package exerciciosFuncoes;

public class exercicio2 {

	public static void main(String[] args) {

		int[][] matriz1 = { { 1, 2, }, { 3, 4, } };

		int[][] matriz2 = { { 5, 6, }, { 7, 8, } };

		int[][] matriz3 = new int[matriz1.length][matriz2[0].length];

		somarMatrizes(matriz1, matriz2, matriz3);

		acheMaior(matriz1, matriz2);

		transporMatriz(matriz1, matriz2);

		multiplicarMatrizes(matriz1, matriz2, matriz3);
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int[] coluna : matriz) {
			for (int element : coluna) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void somarMatrizes(int[][] matriz1, int[][] matriz2, int[][] matriz3) {
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		System.out.println("Soma das matrizes:");
		imprimirMatriz(matriz3);
	}

	public static void acheMaior(int[][] matriz1, int[][] matriz2) {
		int maiorElem1 = matriz1[0][0];
		int maiorElem2 = matriz2[0][0];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				if (matriz1[i][j] > maiorElem1) {
					maiorElem1 = matriz1[i][j];
				}
				if (matriz2[i][j] > maiorElem2) {
					maiorElem2 = matriz2[i][j];
				}
			}
		}

		System.out.println("Maior elemento na matriz1: " + maiorElem1);
		System.out.println("Maior elemento na matriz2: " + maiorElem2);
	}

	public static void transporMatriz(int[][] matriz1, int[][] matriz2) {
		int[][] transpostaMatriz1 = new int[matriz1[0].length][matriz1.length];
		int[][] transpostaMatriz2 = new int[matriz2[0].length][matriz2.length];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				transpostaMatriz1[j][i] = matriz1[i][j];
				transpostaMatriz2[j][i] = matriz2[i][j];
			}
		}

		System.out.println("\nTransposta da matriz1:");
		imprimirMatriz(transpostaMatriz1);

		System.out.println("Transposta da matriz2:");
		imprimirMatriz(transpostaMatriz2);
	}

	public static void multiplicarMatrizes(int[][] matriz1, int[][] matriz2, int[][] matriz3) {
		if (matriz1[0].length != matriz2.length) {
			System.out.println(
					"Multiplicação de matrizes não é possível. Número de colunas da matriz1 não é igual ao número de linhas da matriz2.");
			return;
		}

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				for (int k = 0; k < matriz1[1].length; k++) {
					matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
				}
			}
		}

		System.out.println("Multiplicação das matrizes:");
		imprimirMatriz(matriz3);
	}

}
