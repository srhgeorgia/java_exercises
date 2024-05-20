package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Solicitar ao usuário que insira a distância da viagem
		System.out.println("Digite a distância da viagem em quilômetros:");
		double distancia = sc.nextDouble();

		// Solicitar ao usuário que insira a velocidade média
		System.out.println("Digite a velocidade média em km/h:");
		double velocidadeMedia = sc.nextDouble();

		// Calcular o tempo necessário para a viagem
		double tempoViagem = distancia / velocidadeMedia;

		// Imprimir o resultado
		System.out.printf("O tempo necessário para a viagem é de %.2f horas%n", tempoViagem);

		sc.close();
	}

}
