package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o comprimento do primeiro lado: ");
		double lado1 = sc.nextDouble();

		System.out.print("Digite o comprimento do segundo lado: ");
		double lado2 = sc.nextDouble();

		System.out.print("Digite o comprimento do terceiro lado: ");
		double lado3 = sc.nextDouble();

		String classificacao = classificarTriangulo(lado1, lado2, lado3);

		System.out.println("O triângulo é classificado como: " + classificacao);

		sc.close();
	}

	private static String classificarTriangulo(double lado1, double lado2, double lado3) {
		if (lado1 == lado2 && lado2 == lado3) {
			return "Equilátero"; // Todos os lados são iguais.
		} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			return "Isósceles"; // Dois lados são iguais.
		} else {
			return "Escaleno"; // Todos os lados são diferentes.
		}
	}
}