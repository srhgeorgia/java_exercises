package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = sc.nextLine();
		
		int numeroCaracteres = caracteres(palavra);
		
		System.out.println("O número de caracteres da palavra é: " + numeroCaracteres);
	
		sc.close();
	}

	public static int caracteres(String palavra) {
		return palavra.length();
	}
}
