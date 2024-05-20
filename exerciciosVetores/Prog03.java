package exerciciosVetores;

import java.util.Scanner;

public class Prog03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de pessoas: ");
		int quantidade = sc.nextInt();
		
		double[] alturaPessoas = new double[quantidade];
		double soma = 0;
		
		for (int i = 0; i < alturaPessoas.length; i++) {			
			System.out.println("Digite a altura da pessoa " + (i+1) + ": ");
			alturaPessoas[i] = sc.nextDouble();
			soma = soma +  alturaPessoas[i];			
		}
		
		double media = soma/alturaPessoas.length;
		
		System.out.println("Média das alturas = " + media);
		System.out.println(alturaPessoas);
		
		
		
		
		
		sc.close();
		
		
		
		

	}

}
