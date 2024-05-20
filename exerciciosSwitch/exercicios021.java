package exerciciosSwitch;

import java.util.Scanner;

public class exercicios021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma dessas opções: 1, 2, 3");
		int numero = sc.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("Opção 1 escolhida");
			break;
		case 2:
			System.out.println("Opção 2 escolhida");
			break;
		case 3:
			System.out.println("Opção 3 escolhida");
			break;
		default:
			System.out.println("Opção inválida");
			sc.close();
			return;
		}
		
		sc.close();
	}

}
