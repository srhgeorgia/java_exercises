package exerciciosSwitch;

import java.util.Scanner;

public class exercicios000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do item que você deseja:");
		System.out.println("1: Cachorro-Quente; 2: X-Salada; 3: X-Bacon; 4: Torrada Simples; 5: Refrigerante");
		int opcao = sc.nextInt();

		System.out.println("Agora digite a quantidade do item: ");
		int quantidade = sc.nextInt();

		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;

		double valorTotal;

		switch (opcao) {
		case 1:
			valorTotal = quantidade * cachorroQuente;
			System.out.println("Item número 1: Cachorro-Quente, com a quantidade: " + quantidade
					+ " deu valor total de: " + valorTotal);
			break;
		case 2:
			valorTotal = quantidade * xSalada;
			System.out.println("Item número 1: Cachorro-Quente, com a quantidade: " + quantidade
					+ " deu valor total de: " + valorTotal);
			break;
		case 3:
			valorTotal = quantidade * xBacon;
			System.out.println("Item número 1: Cachorro-Quente, com a quantidade: " + quantidade
					+ " deu valor total de: " + valorTotal);
			break;
		case 4:
			valorTotal = quantidade * torradaSimples;
			System.out.println("Item número 1: Cachorro-Quente, com a quantidade: " + quantidade
					+ " deu valor total de: " + valorTotal);
			break;
		case 5:
			valorTotal = quantidade * refrigerante;
			System.out.println("Item número 1: Cachorro-Quente, com a quantidade: " + quantidade
					+ " deu valor total de: " + valorTotal);
			break;
		default:
			sc.close();
			return;
		}

		sc.close();
	}

}
