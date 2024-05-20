package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int primeiro = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundo = sc.nextInt();
		
		System.out.println("Soma: " + (primeiro + segundo));
		System.out.println("Subtração: " + (primeiro - segundo));
		System.out.println("Multiplicação: " + (primeiro * segundo));
		System.out.println("Divisão: " + (primeiro / segundo));
		
		sc.close();
	}

}
