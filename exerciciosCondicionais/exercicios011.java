package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios011{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a coordenada x: ");
		double x = sc.nextDouble();

		System.out.print("Digite a coordenada y: ");
		double y = sc.nextDouble();

		determinarQuadranteEixoOuOrigem(x, y);

		sc.close();
	}

	private static void determinarQuadranteEixoOuOrigem(double x, double y) {
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo Y");
		} else if (y == 0) {
			System.out.println("Eixo X");
		} else if (x > 0 && y > 0) {
			System.out.println("Primeiro Quadrante");
		} else if (x < 0 && y > 0) {
			System.out.println("Segundo Quadrante");
		} else if (x < 0 && y < 0) {
			System.out.println("Terceiro Quadrante");
		} else if (x > 0 && y < 0) {
			System.out.println("Quarto Quadrante");
		}
	}
}