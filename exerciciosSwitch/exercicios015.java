package exerciciosSwitch;

import java.util.Scanner;

public class exercicios015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha uma figura geométrica:");
		System.out.println("1. Círculo");
		System.out.println("2. Quadrado");
		System.out.println("3. Triângulo");

		int escolha = sc.nextInt();
		double area = 0.0;

		switch (escolha) {
		case 1:
			System.out.print("Digite o raio do círculo: ");
			double raio = sc.nextDouble();
			area = calcularAreaCirculo(raio);
			break;
		case 2:
			System.out.print("Digite o lado do quadrado: ");
			double lado = sc.nextDouble();
			area = calcularAreaQuadrado(lado);
			break;
		case 3:
			System.out.print("Digite a base do triângulo: ");
			double base = sc.nextDouble();
			System.out.print("Digite a altura do triângulo: ");
			double altura = sc.nextDouble();
			area = calcularAreaTriangulo(base, altura);
			break;
		default:
			System.out.println("Opção inválida.");
			sc.close();
			return;
		}

		System.out.println("A área da figura escolhida é: " + area);

		sc.close();
	}

	private static double calcularAreaCirculo(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}

	private static double calcularAreaQuadrado(double lado) {
		return Math.pow(lado, 2);
	}

	private static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
}