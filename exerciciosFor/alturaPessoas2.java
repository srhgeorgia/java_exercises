package exerciciosFor;

import java.util.Scanner;

public class alturaPessoas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double[] alturas = { 1.72, 1.56, 1.80 };

		double valorTotal = 0;

		for (int i = 0; i < alturas.length; i++) {

			valorTotal += alturas[i] / 3;
		}

		System.out.printf("O valor médio das alturas é:  %.2f \n", valorTotal);

		sc.close();
	}

}
