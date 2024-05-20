package exerciciosVetores;

import java.util.Arrays;

public class Prog16 {

	public static void main(String[] args) {

		int[] vetor = { -5, 2, 19, 1, -10, -2, 8, 16, 4 };
		
		Arrays.sort(vetor);
		System.out.println(Arrays.toString(vetor));
		
		int posicao = -1;
		for (int i = 0; i < vetor.length; i++) {			
			if (vetor[i] >= 0) {
				posicao = i;
				break;
			}			
		}
		System.out.println(posicao);
		int[] vetorPositivos = Arrays.copyOfRange(vetor, posicao, vetor.length);
		System.out.println("Vetor de valores positivos");
		System.out.println(Arrays.toString(vetorPositivos));
		
		int[] vetorNegativos = Arrays.copyOfRange(vetor, 0, posicao);
		System.out.println("Vetor de valores negativos");
		System.out.println(Arrays.toString(vetorNegativos));
		

	}

}
