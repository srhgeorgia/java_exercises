package exerciciosFor;

import java.util.Scanner;

public class exercicio03Outros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] quantidadeNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int maiorNumero = 0;
		
		for (int index : quantidadeNumeros){
			System.out.println("Digite o número " + index + "º:");
			int numero = sc.nextInt();
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
	
		sc.close();
		System.out.println("O maior número é: " + maiorNumero);
	}

}
