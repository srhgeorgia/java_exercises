package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		double nota1 = sc.nextDouble();

		System.out.println("Digite a segunda nota:");
		double nota2 = sc.nextDouble();

		System.out.println("Digite a terceira nota:");
		double nota3 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		System.out.printf("A média das notas é: %.2f%n", media);

		sc.close();
	}
}
