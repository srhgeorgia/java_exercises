package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Solicitar ao usuário que insira o preço original
		System.out.println("Digite o preço original do produto:");
		double precoOriginal = sc.nextDouble();

		// Solicitar ao usuário que insira a porcentagem de desconto
		System.out.println("Digite a porcentagem de desconto:");
		double percentualDesconto = sc.nextDouble();

		// Calcular o preço final com desconto
		double desconto = precoOriginal * (percentualDesconto / 100);
		double precoFinal = precoOriginal - desconto;

		// Imprimir o resultado
		System.out.printf("O preço final com %.2f%% de desconto é: R$ %.2f%n", percentualDesconto, precoFinal);

		sc.close();
	}

}
