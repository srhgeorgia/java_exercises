package exerciciosFor;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int quantidadeNumeros = 10;
		int maiorNumero = 0;
		
		for(int i = 1; i <= quantidadeNumeros; i++) {
			System.out.println("Digite o número " + i + "º:");
			int numero = sc.nextInt();
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
	
		sc.close();
		System.out.println("O maior número é: " + maiorNumero);
	}

}
