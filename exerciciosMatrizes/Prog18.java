package exerciciosMatrizes;

import java.util.Scanner;

public class Prog18 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da sua matriz quadrada: ");
		int tamanho = sc.nextInt();
		
		int[][] matriz = new int[tamanho][tamanho];
		
		for (int i = 0; i < matriz.length; i++ ) {
			for (int j = 0; j < matriz[0].length; j++ ) {
				System.out.println("Digite o valor na linha " + i + " coluna " + j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int numNegativos = 0;
		for (int i = 0; i < matriz.length; i++ ) {
			for (int j = 0; j < matriz[0].length; j++ ) {
				if (matriz[i][j] < 0) {
					numNegativos++;
				}
			}
		}
		
		for (int i = 0; i < matriz.length; i++ ) {
			System.out.println(matriz[i][i]);			
		}
		
		
		System.out.println("Quantidade de numeros negativos: " + numNegativos);
		
		
	}

}
