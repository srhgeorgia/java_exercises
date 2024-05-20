package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra ou frase: ");
		String palavraOuFrase = sc.nextLine();
		
		String maiuscula = palavraOuFrase.toLowerCase();
		String minuscula = palavraOuFrase.toUpperCase();
		
		System.out.println("Em maiúscula: " + maiuscula);
		System.out.println("Em minúscula: " + minuscula);
		sc.close();
	}

}
