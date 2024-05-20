package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a hora inicial do jogo: ");
		int horaInicial = sc.nextInt();

		System.out.print("Digite a hora final do jogo: ");
		int horaFinal = sc.nextInt();

		int duracao = calcularDuracao(horaInicial, horaFinal);

		System.out.println("A duração do jogo é de " + duracao + " horas.");

		sc.close();
	}

	private static int calcularDuracao(int horaInicial, int horaFinal) {
		int duracao;

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		return duracao;
	}
}