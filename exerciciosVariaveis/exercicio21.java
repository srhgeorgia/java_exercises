package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Solicitar ao usuário que insira o capital
		System.out.println("Digite o capital (principal):");
		double capital = sc.nextDouble();

		// Solicitar ao usuário que insira a taxa de juros
		System.out.println("Digite a taxa de juros por período:");
		double taxaJuros = sc.nextDouble();

		// Solicitar ao usuário que insira o tempo de aplicação
		System.out.println("Digite o tempo de aplicação em períodos:");
		double tempoAplicacao = sc.nextDouble();

		// Calcular o montante com juros simples
		double montante = calcularJurosSimples(capital, taxaJuros, tempoAplicacao);

		// Imprimir o resultado
		System.out.printf("O montante final é: R$ %.2f%n", montante);

		sc.close();
	}

	// Função para calcular o montante com juros simples
	private static double calcularJurosSimples(double capital, double taxaJuros, double tempoAplicacao) {
		return capital * (1 + (taxaJuros * tempoAplicacao / 100));
	}

}
