package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma frase:");
		String frase = sc.nextLine();

		String primeiraPalavra = extrairPrimeiraPalavra(frase);

		System.out.println("A primeira palavra da frase é: " + primeiraPalavra);

		sc.close();
	}

	private static String extrairPrimeiraPalavra(String frase) {
		String[] palavras = frase.trim().split("\\s+");

		return palavras[0];
	}
}