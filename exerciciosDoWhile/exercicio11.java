package exerciciosDoWhile;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int numero;

		System.out.println("Digite números positivos. Insira um número negativo para encerrar.");

		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			if (numero >= 0) {
				soma += numero;
			}

		} while (numero >= 0);

		System.out.println("A soma dos números positivos inseridos é: " + soma);

		sc.close();
	}

}
