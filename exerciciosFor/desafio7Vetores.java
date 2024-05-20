package exerciciosFor;

import java.util.Scanner;

public class desafio7Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de números: ");
		int quantidadeNumeros = sc.nextInt();

		int[] valores = new int[quantidadeNumeros]; 
		
		//nao eh downcasting eh apenas tipando o vetor 

		System.out.println("Agora digite os valores inseridos: ");

		for (int i = 0; i < quantidadeNumeros; i++) {
			valores[i] = sc.nextInt();
		}
                 
		int menorNumero = valores[0];
		
		for (int i = 1; i < quantidadeNumeros; i++) {
			
			if (valores[i] < menorNumero) {
				menorNumero = valores[i];
			}
		}

		System.out.println("O menor número inserido é: " + menorNumero);

		sc.close();

	}

}
