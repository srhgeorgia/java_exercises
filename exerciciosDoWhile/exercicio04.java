package exerciciosDoWhile;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
        int soma = 0;

        do {
        	System.out.println("Digite um número inteiro (digite 0 para sair): ");
            num = sc.nextInt();
            soma += num;
        } while (num != 0);

        System.out.println("A soma dos números digitados é: " + soma);
		
		
		
		sc.close();
	}

}
