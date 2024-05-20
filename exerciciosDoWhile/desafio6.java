package exerciciosDoWhile;

import java.util.Scanner;

public class desafio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo! \n");

		double produto1 = 2.98;
		double produto2 = 4.50;
		double produto3 = 9.98;
		double produto4 = 4.49;
		double produto5 = 6.87;

		int quantidadeVendida = 0;
		double valorTotal = 0;

		int opcao;

		do {
			System.out.println("Selecione o produto:");
			System.out.println("1 - Sabonete Corpo = R$2,98");
			System.out.println("2 - Sabonete Facial = R$4,50");
			System.out.println("3 - Gilete = R$9,98");
			System.out.println("4 - Pasta Dental = R$4,49");
			System.out.println("5 - Escova Dental = R$6,87");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				quantidadeVendida++;
				valorTotal += produto1;
				break;
			case 2:
				quantidadeVendida++;
				valorTotal += produto2;
				break;
			case 3:
				quantidadeVendida++;
				valorTotal += produto3;
				break;
			case 4:
				quantidadeVendida++;
				valorTotal += produto4;
				break;
			case 5:
				quantidadeVendida++;
				valorTotal += produto5;
				break;
			case 0:
				System.out.println("Até mais!");
				break;
			default:
				System.out.println("Opção Inválida, digite outra opção");
			}

			if (opcao == 0) {
				break;
			}

		} while (true);

		System.out.println("Quantidade total de produtos vendidos: " + quantidadeVendida);
		System.out.println("Valor total de vendas: R$" + valorTotal);

		sc.close();
	}

}
