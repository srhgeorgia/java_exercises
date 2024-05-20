package exerciciosVetores;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = sc.nextInt();

		System.out.println("Agora digite os valores: ");

		int[] vetor = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor na posição " + (i + 1) + ":");
			vetor[i] = sc.nextInt();
		}

		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		System.out.println("Valor total dos valores: " + soma);

		sc.close();
	}

}
