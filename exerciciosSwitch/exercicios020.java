package exerciciosSwitch;

import java.util.Scanner;

public class exercicios020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número de 1 a 10: ");
		int numero = sc.nextInt();

		switch (numero) {
		case 9:
		case 10:
			System.out.println("Nota A");
			break;
		case 8:
			System.out.println("Nota B");
			break;
		case 7:
			System.out.println("Nota C");
			break;
		case 6:
			System.out.println("Nota D");
			break;
		case 5:
			System.out.println("Nota E");
			break;
		default:
			System.out.println("Nota F");
			sc.close();
			return;
		}
		sc.close();

	}
}
