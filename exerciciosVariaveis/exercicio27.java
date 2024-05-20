package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a velocidade de km/h");
		double velocidade = sc.nextDouble();

		System.out.println("Digite o tempo da viagem: ");
		double tempoViagem = sc.nextDouble();

		double distanciaPercorrida = calcularDistancia(velocidade, tempoViagem);

		System.out.printf("Velocidade: %.2f km/h%n", velocidade);
		System.out.printf("Tempo de viagem: %.2f horas%n", tempoViagem);
		System.out.printf("Distância percorrida: %.2f km%n", distanciaPercorrida);

		sc.close();
	}

	protected static double calcularDistancia(double velocidade, double tempoViagem) {
		return velocidade * tempoViagem;
	}
}
