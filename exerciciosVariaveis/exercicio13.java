package exerciciosVariaveis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da peça 1:");
		int codigoPeca1 = sc.nextInt();

		System.out.println("Digite o número de peças 1:");
		int quantidadePeca1 = sc.nextInt();

		System.out.println("Digite o valor unitário da peça 1:");
		double valorUnitarioPeca1 = sc.nextDouble();

		System.out.println("    ");

		System.out.println("Digite o código da peça 2:");
		int codigoPeca2 = sc.nextInt();

		System.out.println("Digite o número de peças 2:");
		int quantidadePeca2 = sc.nextInt();

		System.out.println("Digite o valor unitário da peça 2:");
		double valorUnitarioPeca2 = sc.nextDouble();

		double totalPeca1 = quantidadePeca1 * valorUnitarioPeca1;
		double totalPeca2 = quantidadePeca2 * valorUnitarioPeca2;
		double valorTotal = totalPeca1 + totalPeca2;

		System.out.println("    ");

		System.out.printf("Valor a ser pago: R$ %.2f%n", valorTotal);

		sc.close();
	}

}
