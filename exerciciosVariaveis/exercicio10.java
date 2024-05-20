package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		String login = (idade >= 18) ? "Pode logar" : "Idade não permitida";
		System.out.println(login);
		
		sc.close();
	}

}
