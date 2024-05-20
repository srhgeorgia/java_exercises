package exerciciosFor;

import java.util.Scanner;

public class desafio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de números: ");
		int quantidadeNumeros = sc.nextInt();

		System.out.println("Digite o primeiro número: ");
		int menorNumero = sc.nextInt();
		
		for (int i = 2; i <= quantidadeNumeros; i++) {

            System.out.println("Digite o " + i + "º número: ");
			int num = sc.nextInt();

			if (num < menorNumero) {
				menorNumero = num;
			}
		}

		System.out.println("O menor número inserido é: " + menorNumero);

		sc.close();

	}

}
