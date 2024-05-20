package exerciciosMatrizes;

public class Prog17 {

	public static void main(String[] args) {
		
		int[][] matriz = {  {1,2,3}, {4,5,6}};
		
		int[][] matriz2 = new int[3][3];
		matriz2[0][1] = 2;
		
		// Percorrendo a matriz por completo
		// Inicialmente seleciona-se a linha e depois das colunas
		for (int i = 0; i < 2; i++ ) {
			for (int j = 0; j < 3; j++ ) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();			
		}
		
		// Percorrendo a linha 0 da matriz
		for (int j = 0; j < 3; j++ ) {
			System.out.print(matriz[0][j] + " ");		
		}
		
		System.out.println();
		System.out.println(matriz.length);
		System.out.println(matriz[0].length);
		
		
		for (int i = 0; i < 2; i++ ) {
			for (int valor : matriz[i]) {
				System.out.print(valor + " ");
			}
			System.out.println();			
		}
		

	}

}
