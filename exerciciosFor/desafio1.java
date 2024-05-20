package exerciciosFor;

import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		
		for(int i = 1; i <= numero; i++) {
			
			if(numero % i == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}

}
