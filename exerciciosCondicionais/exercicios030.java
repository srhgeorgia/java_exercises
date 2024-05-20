package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		String parOuImpar = (numero % 2 == 0) ? "Par" : "Ímpar";
		
		System.out.println(parOuImpar);
		
		sc.close();
	}

}
