package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		String positivoOuNegativo = (numero > 0) ? "Positivo" : "Negativo";
			
		System.out.println(positivoOuNegativo);
		
		sc.close();
	}

}
