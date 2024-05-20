package exerciciosVetores;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de pessoas: ");
		int quantidadePessoas = sc.nextInt();

		String[] nomes = new String[quantidadePessoas];
		int[] idades = new int[quantidadePessoas];

		for (int i = 0; i < quantidadePessoas; i++) {
			System.out.print("Informe o nome da pessoa " + (i + 1) + ": ");
			nomes[i] = sc.next();

			System.out.print("Informe a idade da pessoa " + (i + 1) + ": ");
			idades[i] = sc.nextInt();
		}

		int indicePessoaMaisVelha = 0;
		for (int i = 1; i < quantidadePessoas; i++) {
			if (idades[i] > idades[indicePessoaMaisVelha]) {
				indicePessoaMaisVelha = i;
			}
		}

		System.out.println("\nA pessoa mais velha é: " + nomes[indicePessoaMaisVelha]);
		
		sc.close();
	}
}
