package exerciciosFor;

import java.util.Scanner;

public class alturaPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de alturas a serem inseridas: ");
		int quantidadeAlturas = sc.nextInt();

		double[] alturas = new double[quantidadeAlturas];

		System.out.println("Agora digite as alturas a serem inseridas: ");

		for (int i = 0; i < quantidadeAlturas; i++) {
			alturas[i] = sc.nextDouble();
		}

		double valorTotal = 0;
		for (int i = 0; i < quantidadeAlturas; i++) {

			valorTotal += alturas[i] / quantidadeAlturas;
		}

		System.out.printf("O valor médio das alturas é:  %.2f \n", valorTotal);

		sc.close();
	}

}
