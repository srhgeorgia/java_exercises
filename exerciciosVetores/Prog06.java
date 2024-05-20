package exerciciosVetores;

import java.util.Scanner;

public class Prog06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor em reais para sacar: ");
		int valor = sc.nextInt();

		int[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };

		System.out.println("Quantidade mínima de cédulas");

		for (int cedula : cedulas) {
			int quantidadeCedulas = valor / cedula;
			valor %= cedula;
			if (quantidadeCedulas > 0) {
				System.out.println("R$" + cedula + ": " + quantidadeCedulas + " Cédulas");
			}
		}
		sc.close();

	}

}
