package exerciciosVetores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog15 {

	public static void main(String[] args) {
		
		int[] vetor = {3,1,5,18,14,2,6};
		System.out.println("Vetor Original");
		for (int element : vetor) {
			System.out.print(element + " ");
		}
		
		// Ordenando em ordem crescente
		Arrays.sort(vetor);
		
		
		System.out.println();
		System.out.println("Vetor atualizado");
		for (int element : vetor) {
			System.out.print(element + " ");
		}
		
		
		// Comparando se dois vetores são iguais
		int[] vetor1 = {3,1,5,18,14,2,6};	
		int[] vetor2 = {3,1,5,18,14,2,6};
		boolean saoIguais = Arrays.equals(vetor1, vetor2);
		System.out.println();
		System.out.println(saoIguais);
		
		// Preencher todo o vetor com o valor especificado
		int[] vetor3 = new int[5];
		Arrays.fill(vetor3, 50);
		System.out.println("Vetor atualizado");
		for (int element : vetor3) {
			System.out.print(element + " ");
		}
		
		// Busca Binaria
		int[] vetor5 = {1,2,3,4,5};
		int posicao = Arrays.binarySearch(vetor5, 4);
		System.out.println();
		System.out.println(posicao);
		
		int[] vetor6 =  {1,2,3,4,5};
		int[] copia = Arrays.copyOf(vetor6, 3);
		System.out.println(Arrays.toString(copia));
		
		
		
		
		
		
		
		
		
		
		

	}

}
