package exerciciosVetores;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] vetor = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

		System.out.println("Digite o elemento procurado: ");
		int elementoProcurado = sc.nextInt();

		int indiceEncontrado = -1;
		int inicio = 0;
		int fim = vetor.length - 1;

		while (inicio <= fim) {

			int meio = (inicio + fim) / 2;

			if (vetor[meio] == elementoProcurado) {
				indiceEncontrado = meio;
				break;
			} else if (vetor[meio] < elementoProcurado) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}

		if (indiceEncontrado != -1) {
			System.out.println("O elemento " + elementoProcurado + " foi encontrado na posição " + indiceEncontrado);
		} else {
			System.out.println("O elemento " + elementoProcurado + " não foi encontrado");
		}

		sc.close();
	}

}
