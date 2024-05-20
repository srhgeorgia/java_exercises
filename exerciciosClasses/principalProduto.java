package exerciciosClasses;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principalProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();

		System.out.print("Digite o número de produtos: ");
		int n = scanner.nextInt();
		scanner.nextLine(); 

		for (int i = 1; i <= n; i++) {
			System.out.println("\nDados do produto #" + i);
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Preço: ");
			double preco = scanner.nextDouble();
			scanner.nextLine(); 

			System.out.print("É um produto importado? (s/n): ");
			char resposta = scanner.next().charAt(0);
			scanner.nextLine(); 
			if (resposta == 's') {
				System.out.print("Taxa de alfândega: ");
				double taxaAlfandega = scanner.nextDouble();
				produtos.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			} else {
				System.out.print("É um produto usado? (s/n): ");
				resposta = scanner.next().charAt(0);
				scanner.nextLine(); 
				if (resposta == 's') {
					try {
						System.out.print("Data de fabricação (dd/MM/yyyy): ");
						String dataFabricacao = scanner.nextLine();
						produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
					} catch (ParseException e) {
						System.out.println("Formato de data inválido. Utilize o formato dd/MM/yyyy.");
						return;
					}
				} else {
					produtos.add(new Produto(nome, preco));
				}
			}
		}

		System.out.println("\nEtiqueta de preço de cada produto:");
		for (Produto produto : produtos) {
			System.out.println(produto.etiquetaPreco());
		}

		scanner.close();

	}

}
