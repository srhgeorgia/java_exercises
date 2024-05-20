package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Solicitar ao usuário que insira seu peso
		System.out.println("Digite seu peso em kg:");
		double peso = sc.nextDouble();

		// Solicitar ao usuário que insira sua altura
		System.out.println("Digite sua altura em metros:");
		double altura = sc.nextDouble();

		// Calcular o IMC
		double imc = peso / (altura * altura);

		// Imprimir o resultado
		System.out.printf("Seu Índice de Massa Corporal (IMC) é: %.2f%n", imc);

		// Interpretar o IMC
		interpretarIMC(imc);

		sc.close();
	}

	// Função para interpretar o IMC e fornecer uma mensagem
	private static void interpretarIMC(double imc) {
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso.");
		} else if (imc < 25) {
			System.out.println("Você está com o peso normal.");
		} else if (imc < 30) {
			System.out.println("Você está com sobrepeso.");
		} else {
			System.out.println("Você está com obesidade.");
		}
	}
}
