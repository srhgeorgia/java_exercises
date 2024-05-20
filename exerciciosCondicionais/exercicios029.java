package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		String negativoOuNao = (numero > 0) ? "Positivo" : "Negativo";
		
		System.out.println(negativoOuNao);
		
		sc.close();
	}

}
