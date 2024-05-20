package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios004{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int primeiro = sc.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int segundo = sc.nextInt();
		
		System.out.println("Digite o terceiro número inteiro: ");
		int terceiro = sc.nextInt();
		
		if(primeiro > segundo && primeiro > terceiro) {
			System.out.println("Primeiro número mais alto");
		}else if(segundo > terceiro) {
			System.out.println("Segundo número mais alto");
		}else {
			System.out.println("Terceiro número mais alto");
		}
		
		sc.close();
	}

}
