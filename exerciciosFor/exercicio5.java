package exerciciosFor;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número N: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Digite o par de números " + i + ":");
			double numerador = sc.nextDouble();
			double denominador = sc.nextDouble();

			if (denominador != 0) {
				double resultado = numerador / denominador;
				System.out.println("Resultado da divisão: " + resultado);
			} else {
				System.out.println("Divisão impossível. O denominador não pode ser zero.");
			}
		}

		sc.close();
	}

}
