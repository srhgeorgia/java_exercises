package exerciciosWhile;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int X;

		System.out.println("Digite um número inteiro X (1 <= X <= 1000):");
		X = sc.nextInt();

		while (!(1 <= X && X <= 1000)) {
			System.out.println("Valor digitado inválido. Digite outro número: ");
			X = sc.nextInt();
		}

		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println("Índice " + i + ": " + i + " é ímpar");
			}
		}

		sc.close();
	}

}
