package exerciciosWhile;

import java.util.Random;
import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();

		int numeroSorteado = aleatorio.nextInt(100) + 1;
		int tentativas = 0;

		System.out.println("Jogo de adivinhação: tente adivinhar o número!");

		while (true) {
			System.out.println("Digite sua escolha");
			int escolha = sc.nextInt();
			tentativas++;

			sc.nextLine();

			if (escolha == numeroSorteado) {
				System.out.println("Parabéns, você acertou em " + tentativas + " tentativas.");
				System.out.println("Deseja jogar novamente? (S/N)");
				String resposta = sc.nextLine();
				
				if (!resposta.equalsIgnoreCase("S")) {
					System.out.println("Boa sorte na próxima vez!");
					break;
				}
				
				numeroSorteado = aleatorio.nextInt(100) + 1;
			} else if (escolha < numeroSorteado) {
				System.out.println("Digite um número maior.");
			} else {
				System.out.println("Digite um número menor.");
			}
		}

		sc.close();

	}

}
