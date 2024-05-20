package exerciciosVariaveis;

import java.util.Scanner;

public class exercicios002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor inteiro de X: ");
		int X = sc.nextInt();
		
		System.out.println("Digite o valor inteiro de Y: ");
		int Y = sc.nextInt();
		
		String mensagem = (X % Y == 0) ? "São múltiplos" : "Não são múltiplos";
		
		System.out.println(mensagem);
		
		sc.close();
	}

}
