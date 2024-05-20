package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o salário: R$ ");
		double salario = scanner.nextDouble();

		double imposto = calcularImpostoRenda(salario);

		System.out.printf("Imposto de Renda a ser pago: R$ %.2f%n", imposto);

		scanner.close();
	}

	private static double calcularImpostoRenda(double salario) {
		double imposto = 0;

		if (salario > 2000.00) {
			double salarioIsento = Math.min(salario, 3000.00);
			double faixa1 = salarioIsento - 2000.00;

			imposto += faixa1 * 0.08;

			if (salario > 3000.00) {
				double faixa2 = salario - 3000.00;
				imposto += faixa2 * 0.18;
			}
		}

		return imposto;
	}
}