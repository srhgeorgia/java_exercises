package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite A: ");
		double A = sc.nextDouble();
		
		System.out.println("Digite B: ");
		double B = sc.nextDouble();
		
		System.out.println("Digite C: ");
		double C = sc.nextDouble();
		
		double raizQuadrada = Math.sqrt(C);
		
		System.out.println("area do triangulo retangulo que tem A por base e C por altura: " +  ((A * C) /2));
		System.out.println("area do círculo de raio C: " +  ((A * C) /2));
		System.out.printf("area do do trapézio que tem A e B por bases e C por altura:  %.2f%n", ((Math.PI * raizQuadrada)));
		System.out.println("area do  do quadrado que tem lado B: " + (B * B));
		System.out.println("area do do retângulo que tem lados A e B: " +  (A * B));
	
		sc.close();
	}

}
