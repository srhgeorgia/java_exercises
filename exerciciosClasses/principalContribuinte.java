package exerciciosClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principalContribuinte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Contribuinte> contribuintes = new ArrayList<>();

		System.out.print("Digite o número de contribuintes: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nDados do contribuinte #" + i);
			System.out.print("Tipo (1 - Pessoa Física, 2 - Pessoa Jurídica): ");
			int tipo = scanner.nextInt();
			scanner.nextLine(); 

			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = scanner.nextDouble();

			if (tipo == 1) {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = scanner.nextDouble();
				contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = scanner.nextInt();
				contribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}

		System.out.println("\nImposto pago por cada contribuinte:");
		for (Contribuinte contribuinte : contribuintes) {
			if (contribuinte instanceof PessoaFisica) {
				PessoaFisica pf = (PessoaFisica) contribuinte;
				System.out.println(pf.getNome() + ": R$" + pf.calcularImposto());
			} else if (contribuinte instanceof PessoaJuridica) {
				PessoaJuridica pj = (PessoaJuridica) contribuinte;
				System.out.println(pj.getNome() + ": R$" + pj.calcularImposto());
			}
		}

		double totalImpostoArrecadado = 0;
		for (Contribuinte contribuinte : contribuintes) {
			if (contribuinte instanceof PessoaFisica) {
				PessoaFisica pf = (PessoaFisica) contribuinte;
				totalImpostoArrecadado += pf.calcularImposto();
			} else if (contribuinte instanceof PessoaJuridica) {
				PessoaJuridica pj = (PessoaJuridica) contribuinte;
				totalImpostoArrecadado += pj.calcularImposto();
			}
		}

		System.out.println("\nTotal de imposto arrecadado: R$" + totalImpostoArrecadado);

		scanner.close();
	}
}
