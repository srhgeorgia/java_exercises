package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Insira sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Seu nome é: " + nome + ", e sua idade é: " + idade);
	
		sc.close();
	}

}
