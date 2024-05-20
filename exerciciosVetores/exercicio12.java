package exerciciosVetores;

import java.util.Scanner;

public class exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de pessoas: ");
		int numPessoas = sc.nextInt();

		String[] nomes = new String[numPessoas];
		int[] idades = new int[numPessoas];
		double[] alturas = new double[numPessoas];

		for (int i = 0; i < numPessoas; i++) {
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
		double mediaAlturas = somaAlturas / numPessoas;

		int contMenoresDe16 = 0;
		StringBuilder nomesMenoresDe16 = new StringBuilder("Nomes das pessoas com menos de 16 anos:\n");

		for (int i = 0; i < numPessoas; i++) {
			if (idades[i] < 16) {
				contMenoresDe16++;
				nomesMenoresDe16.append(nomes[i]).append("\n");
			}
		}

		System.out.println("\nTabela de Dados:");
		System.out.println("+--------+------+-------+");
		System.out.println("|  Nome  | Idade| Altura|");
		System.out.println("+--------+------+-------+");

		for (int i = 0; i < numPessoas; i++) {
			System.out.printf("| %-6s | %-4d | %-5.2f |\n", nomes[i], idades[i], alturas[i]);
		}

		System.out.println("+--------+------+-------+");
		System.out.printf("Altura Média: %.2f metros\n", mediaAlturas);
		System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%\n",
				((double) contMenoresDe16 / numPessoas) * 100);

		if (contMenoresDe16 > 0) {
			System.out.println("\n" + nomesMenoresDe16);
		}
		sc.close();
	}
}
