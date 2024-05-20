package exerciciosVetores;

import java.util.Scanner;

public class Prog04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de números que você quer digitar : ");
		int quantidade = sc.nextInt();
		int[] vetorNumeros = new int[quantidade];

		int negativo = 0;
		int positivo = 0;

		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.printf("Digite o %d° numero inteiro do vetor ", i + 1);
			vetorNumeros[i] = sc.nextInt();

			if (vetorNumeros[i] < 0) {
				negativo++;
			} else {
				positivo++;
			}
		}
		
		int[] vetorPositivos = new int[positivo];
		int[] vetorNegativos = new int[negativo];
		
		positivo = 0;
		negativo = 0;
		
		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] < 0) {
				vetorNegativos[negativo] = vetorNumeros[i];
				negativo++;
			} else {
				vetorPositivos[positivo] = vetorNumeros[i];
				positivo++;
			}
		}
		
		System.out.println("Negativos");
		for (int i = 0; i < vetorNegativos.length; i++) {
			System.out.print(vetorNegativos[i] + " ");			
		}
		
		System.out.println();
		System.out.println("Positivos");
		for (int i = 0; i < vetorPositivos.length; i++) {
			System.out.print(vetorPositivos[i] + " ");			
		}
		
		sc.close();
		

	}

}
