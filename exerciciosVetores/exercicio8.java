package exerciciosVetores;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de números: ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Informe o número " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("\nNúmeros pares:");

		int contPares = 0;
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				System.out.println(numero);
				contPares++;
			}
		}

//		for (int numero : numeros) {
//		    if (numero % 2 == 0) {
//		        System.out.println(numero);
//		        somaPares += numero; // aqui você está somando os valores dos números pares
//		        contPares++;
//		    }
//		}
//		
		System.out.println("\nQuantidade de números pares: " + contPares);

		sc.close();
	}

}
