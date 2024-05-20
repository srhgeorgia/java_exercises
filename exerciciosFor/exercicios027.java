package exerciciosFor;

import java.util.Scanner;

public class exercicios027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int totalQuilometros = 0;
		int totalLitros = 0;

		for (int viagem = 1; viagem <= 3; viagem++) {
			System.out.println("Viagem " + viagem);

			System.out.print("Digite os quilômetros dirigidos: ");
			int quilometros = sc.nextInt();

			System.out.print("Digite a quantidade de litros de gasolina consumidos: ");
			int litros = sc.nextInt();

			double consumo = (double) quilometros / litros;

			System.out.println(" ");
			System.out.println("Consumo médio: " + consumo + " km/l");

			totalQuilometros += quilometros;
			totalLitros += litros;

			System.out.println(" ");
			System.out.println("Quilometragem total até o momento: " + totalQuilometros);
			System.out.println("Total de litros consumidos até o momento: " + totalLitros);
			System.out.println();
		}

		sc.close();
	}
}
