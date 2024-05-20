package exerciciosVetores;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de números: ");
		int n = sc.nextInt();

		double[] numeros = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Informe o número " + (i + 1) + ": ");
			numeros[i] = sc.nextDouble();
		}

		double soma = 0;
		for (double numero : numeros) {
			soma += numero;
		}
		double media = soma / n;

		System.out.printf("\nMédia Aritmética: %.3f\n", media);

		System.out.println("\nElementos abaixo da média:");
		for (double numero : numeros) {
			if (numero < media) {
				System.out.printf("%.1f\n", numero);
			}
		}
		
		sc.close();
	}

}
