package exerciciosDoWhile;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X, Y;

		do {
			System.out.println("Digite as coordenadas X e Y: ");
			X = sc.nextInt();
			Y = sc.nextInt();

			if ((X > 0) && (Y > 0)) {
				System.out.println("1º Quadrante");
			} else if ((X < 0) && (Y > 0)) {
				System.out.println("2º Quadrante");
			} else if ((X < 0) && (Y < 0)) {
				System.out.println("3º Quadrante");
			} else if ((X > 0) && (Y < 0)) {
				System.out.println("4º Quadrante");
			}

			if ((X == 0) || (Y == 0)) {
				System.out.println("Coordenada nula.");
				break;
			}

			System.out.println("Deseja sair do programa? [S/N]");
			char sair = sc.next().toUpperCase().charAt(0);

			if (sair == 'S') {
				System.out.println("Parando o programa");
				break;
			}

		} while ((X != 0) && (Y != 0));

		sc.close();
	}

}
