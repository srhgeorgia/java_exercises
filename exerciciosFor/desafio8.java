package exerciciosFor;

import java.util.Scanner;

public class desafio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o montante inicial (capital): ");
		double capital = sc.nextDouble();

		System.out.println("Digite a taxa de juros anual (em decimal): ");
		double taxaJurosAnual = sc.nextDouble();

		System.out.println("Digite o número de anos: ");
		int numeroAnos = sc.nextInt();

		for (int ano = 1; ano <= numeroAnos; ano++) {
			double montanteFinal = calcularMontanteFinal(capital, taxaJurosAnual, ano);
			System.out.printf("Ano %d: Montante Final = %.2f\n", ano, montanteFinal);
		}

		sc.close();
	}

	public static double calcularMontanteFinal(double capital, double taxaJurosAnual, int numeroAnos) {
		double taxaJurosMensal = taxaJurosAnual / 12;
		int numeroPagamentos = numeroAnos * 12;

		double montanteFinal = capital * Math.pow(1 + taxaJurosMensal, numeroPagamentos);

		return montanteFinal;
	}
}
