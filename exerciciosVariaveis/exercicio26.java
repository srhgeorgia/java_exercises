package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma frase com espaços em branco no início e no final: ");
		String frase = sc.nextLine();
		
		System.out.println("Frase com espaços: " + frase);
		
		String semEspacos = removerEspacos(frase);
	
		System.out.println("   ");
		
		System.out.println("Frase sem espaços: " + semEspacos);
		
		sc.close();
	}
	
	private static String removerEspacos(String frase) {
		return frase.trim();
	}
}
