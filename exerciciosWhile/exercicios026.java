package exerciciosWhile;

import java.util.Scanner;

public class exercicios026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao banco nimbus!");
		System.out.println("Digite seu CPF: ");
		String cpfDigitado = sc.nextLine();

		String cpf = cpfDigitado.replace(".", "").replace("-", "");

		if (cpf.equals("11122233344")) {
			System.out.println(" ");
			System.out.println("Bem vindo à sua conta número de CPF: 111.222.333-04");
		} else {
			System.out.println(" ");
			System.out.println("CPF incorreto. Acesso negado.");
			sc.close();
			return;
		}

		double saldo = 0.00;

		while (true) {
			exibirMenu();
			System.out.println("Digite o número da operação que deseja realizar: ");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Seu saldo é igual: " + saldo);
				System.out.println(" ");
				break;
			case 2:
				System.out.println("Digite o valor a sacar: ");
				System.out.println(" ");
				double sacar = sc.nextDouble();
				if (saldo >= sacar) {
					saldo -= sacar;
					System.out.println("Seu saldo é de: " + saldo);
					System.out.println(" ");
				} else {
					System.out.println("Saldo indisponível para saque!");
					System.out.println(" ");
				}
				break;
			case 3:
				System.out.println(" ");
				System.out.println("Digite o valor a ser depositado: ");
				double deposito = sc.nextDouble();
				saldo += deposito;
				System.out.println(" ");
				System.out.println("Seu novo saldo é de: " + saldo);
				break;
			case 4:
				System.out.println(" ");
				System.out.println("Digite o valor a ser transferido: ");
				double transferencia = sc.nextDouble();
				if (saldo >= transferencia) {
					saldo -= transferencia;
					System.out.println(" ");
					System.out.println("Seu saldo é de: " + saldo);
				} else {
					System.out.println(" ");
					System.out.println("Saldo indisponível para transferência!");
				}
				break;
			case 5:
				System.out.println(" ");
				System.out.println("Encerrando!");
				sc.close();
				return;
			default:
				System.out.println(" ");
				System.out.println("Opção inválida. Por favor, escolha novamente.");
				break;
			}
		}
	}

	private static void exibirMenu() {
		System.out.println(" ");
		System.out.println("Opções disponíveis:");
		System.out.println(" ");
		System.out.println(
				"1- Consultar saldo; 2- Sacar dinheiro; 3- Depositar dinheiro; 4- Transferir dinheiro; 5- Encerrar");
	}
}