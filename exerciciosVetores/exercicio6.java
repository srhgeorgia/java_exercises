package exerciciosVetores;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = sc.nextInt();

		System.out.println("Agora digite os valores: ");

		int[] vetor = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Vetor na posição " + (i + 1) + ":");
			vetor[i] = sc.nextInt();
		}

		boolean ordemCrescente = true;

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] < vetor[i - 1]) {
				ordemCrescente = false;
				break;
			}
		}

		if (ordemCrescente) {
			System.out.println("Estão em ordem crescente");
		} else {
			System.out.println("Ordem descrecente");
		}

		sc.close();
	}

}
