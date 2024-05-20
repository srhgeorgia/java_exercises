package exerciciosWhile;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a senha até que seja válida!");
		System.out.println("Você tem 5 tentativas. \n");

		int tentativas = 1;
		int maxTentativas = 5;

		int senhaCorreta = 2002;
		boolean acertou = false; 

		while (tentativas <= maxTentativas && !acertou) {
			int senha = sc.nextInt();
			
			if (senha != senhaCorreta) {
				System.out.println(tentativas + " tentativa incorreta. Senha inválida. \n");
				tentativas++;	
			} else {
				System.out.println("Parabéns, acertou a senha. Acesso permitido.");
				acertou = true;
			}
			
		}
		
		if (!acertou) {
			System.out.println("Senha incorreta. Tente da próxima vez.");
		}

		sc.close();
	}

}
