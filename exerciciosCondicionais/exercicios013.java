package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios013{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu peso em kg:");
		double peso = sc.nextDouble();

		System.out.println("Digite sua altura em metros:");
		double altura = sc.nextDouble();

		double imc = peso / (altura * altura);

		interpretarIMC(imc);
		
		System.out.printf("Seu Índice de Massa Corporal (IMC) é: %.2f%n", imc);

		sc.close();
	}

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
