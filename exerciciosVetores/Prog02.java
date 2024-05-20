package exerciciosVetores;

import java.util.Scanner;

public class Prog02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de nomes que deseja inserir");
		int tamanho = sc.nextInt();
		sc.nextLine();
		// Criando o vetor de Strings
		String[] nomes = new String[tamanho];

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o nome " + (i + 1) + ": ");
			nomes[i] = sc.nextLine().toLowerCase();
		}

		// Procurar o Fabio
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nome: " + nomes[i]);
			if (nomes[i].equals("fabio")) {
				System.out.println("O Fabio está na posição: " + i);
			}

		}

		sc.close();
	}

}
