package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor total da compra: R$ ");
		double valorCompra = sc.nextDouble();

		double desconto = calcularDesconto(valorCompra);
		double valorFinal = valorCompra - (valorCompra * desconto);

		System.out.println("O valor final a ser pago é: R$ " + valorFinal);

		sc.close();
	}

	private static double calcularDesconto(double valorCompra) {
		double desconto = 0.0;

		if (valorCompra < 100) {
			desconto = 0.0;
		} else if (valorCompra <= 500) {
			desconto = 0.05; // 5%
		} else if (valorCompra <= 1000) {
			desconto = 0.10; // 10% 
		} else {
			desconto = 0.15; // 15%
		}

		return desconto;
	}

}
