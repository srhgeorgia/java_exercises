package exerciciosVetores;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de numeros a serem inseridos: ");
		int quantidade = sc.nextInt();

		int[] vetorNumeros = new int[quantidade];

		int countPositivos = 0;
		int countNegativos = 0;

		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.printf("Digite o %d° numero inteiro do vetor: ", i + 1);
			vetorNumeros[i] = sc.nextInt();
			if (vetorNumeros[i] < 0) {
				countNegativos++;
			} else {
				countPositivos++;
			}
		}

		int[] positivos = new int[countPositivos];
		int[] negativos = new int[countNegativos];

		int indicePositivo = 0;
		int indiceNegativo = 0;

		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] < 0) {
				negativos[indiceNegativo++] = vetorNumeros[i];
			} else {
				positivos[indicePositivo++] = vetorNumeros[i];
			}
		}

		System.out.println("Números positivos:");
		for (int num : positivos) {
//			for (int i = 0; i < positivos.length; i++)
			System.out.println(num);
		}

		System.out.println("Números negativos:");
		for (int num : negativos) {
			// for (int i = 0; i < negativos.length; i++)
			System.out.println(num);
		}

		sc.close();
	}

}
