package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota");
		int notaUm = sc.nextInt();
		
		System.out.println("Digite sua segunda nota");
		int notaDois = sc.nextInt();
		
		System.out.println("Digite sua terceira nota");
		int notaTres = sc.nextInt();
		
		double media = (notaUm + notaDois + notaTres) / 3;
		
		String resultado = (media >= 7) ? "Aprovado" : "Não aprovado";
		
		System.out.println(resultado);
		
		sc.close();
		
	}

}
