package exerciciosVetores;

import java.util.Scanner;

public class Prog07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetor = {5,12,8,3,15};
		int maior = vetor[0];
		
		for (int i = 0; i < vetor.length; i++  ) {			
			if (vetor[i] > maior) {
				maior = vetor[i];
			}			
		}
		
		System.out.println("O numero maior do vetor é :" + maior);
		maior = vetor[0];
		for (int numero : vetor) {
			if (numero > maior) {
				maior = numero;
			}
		}		
		System.out.println("O numero maior do vetor é :" + maior);

		sc.close();

	}

}
