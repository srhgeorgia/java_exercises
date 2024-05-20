package exerciciosDoWhile;

import java.util.Random;
import java.util.Scanner;

public class exercicios010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int somaDados;

		System.out.println("Bem vindo ao jogo de Dados!");

		do {
			int dado1 = lançarDados(random);
			int dado2 = lançarDados(random);
			somaDados = dado1 + dado2;

			System.out.println("Você lançou os dados. Os resultados são:");
			System.out.println("Dado 1: " + dado1);
			System.out.println("Dado 2: " + dado2);
			System.out.println("Soma dos dados: " + somaDados);

			if (somaDados == 7 || somaDados == 11) {
				System.out.println(" ");
				System.out.println("Parabéns, você ganhou!");
				break;
			} else if (somaDados == 2 || somaDados == 3 || somaDados == 12) {
				System.out.println(" ");
				System.out.println("Infelizmente, você perdeu.");
				break;
			} else {
				System.out.println(" ");
				System.out.println("Você não ganhou, nem perdeu. Jogue novamente!");
				System.out.println("Deseja jogar novamente? (S/N)");
				sc.nextLine();
				String resposta = sc.nextLine();

				if (!resposta.equalsIgnoreCase("S")) {
					System.out.println("Certo, boa sorte na próxima vez!");
					break;
				}
			}
		} while (true);

		sc.close();
	}

	private static int lançarDados(Random random) {
		return random.nextInt(6) + 1;
	}
}
