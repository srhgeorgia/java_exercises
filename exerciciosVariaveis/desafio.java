package exerciciosVariaveis;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as coordenadas do Ponto 1 (x1 y1):");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		System.out.println("Digite as coordenadas do Ponto 2 (x2 y2):");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		double distanciaEuclidiana = calcularDistanciaEuclidiana(x1, y1, x2, y2);

		System.out.printf("Distância Euclidiana entre os pontos: %.2f%n", distanciaEuclidiana);

		sc.close();
	}

	private static double calcularDistanciaEuclidiana(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}