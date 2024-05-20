package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite seu último nome: ");
		String ultimo = sc.nextLine();
		
		System.out.println("Seu nome é: " + nome+" " + ultimo);
		
		sc.close();
	}

}
