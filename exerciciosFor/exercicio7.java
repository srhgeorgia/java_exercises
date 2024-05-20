package exerciciosFor;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro para calcular o fatorial: ");
		int N = sc.nextInt();

		int fatorial = 1;

		if (N < 0) {
			System.out.println("Fatorial não definido para números negativos.");
		} else {
			for (int i = 1; i <= N; i++) {
				fatorial *= i;
			}

			System.out.println("O fatorial de " + N + " é: " + fatorial);
		}

		sc.close();
	}
}
