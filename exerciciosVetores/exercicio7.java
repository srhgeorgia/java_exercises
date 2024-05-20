package exerciciosVetores;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você deseja cadastrar? ");
		int quantidadePessoas = sc.nextInt();

		String[] nomes = new String[quantidadePessoas];
		int[] idades = new int[quantidadePessoas];
		double[] alturas = new double[quantidadePessoas];

		for (int i = 0; i < quantidadePessoas; i++) {
			System.out.println("\nInforme os dados da pessoa " + (i + 1) + ":");

			System.out.print("Nome: ");
			nomes[i] = sc.next();

			System.out.print("Idade: ");
			idades[i] = sc.nextInt();

			System.out.print("Altura (em metros): ");
			alturas[i] = sc.nextDouble();
		}

		double somaAlturas = 0;
		for (double altura : alturas) {
			somaAlturas += altura;
		}
		double mediaAlturas = somaAlturas / quantidadePessoas;

		int contMenoresDe16 = 0;
		StringBuilder nomesMenoresDe16 = new StringBuilder("Pessoas com menos de 16 anos:\n");

		for (int i = 0; i < quantidadePessoas; i++) {
			if (idades[i] < 16) {
				contMenoresDe16++;
				nomesMenoresDe16.append("- ").append(nomes[i]).append("\n");
			}
		}

		System.out.println("\nAltura média das pessoas: " + mediaAlturas + " metros");
		System.out.println("Porcentagem de pessoas com menos de 16 anos: "
				+ ((double) contMenoresDe16 / quantidadePessoas) * 100 + "%");

		if (contMenoresDe16 > 0) {
			System.out.println(nomesMenoresDe16);
		}
		
		sc.close();
	}

}
