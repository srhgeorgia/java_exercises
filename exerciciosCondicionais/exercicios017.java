package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número inteiro: ");
		int numero1 = sc.nextInt();

		System.out.print("Digite o segundo número inteiro: ");
		int numero2 = sc.nextInt();

		int maiorNumero = (numero1 > numero2) ? numero1 : numero2;

		System.out.println("O maior número é: " + maiorNumero);

		sc.close();
	}

}
