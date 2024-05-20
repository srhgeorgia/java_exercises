package exerciciosVetores;

import java.util.Scanner;

public class exercicios005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] numeros = new int[3];
		
		System.out.println("Digite o primeiro número inteiro: ");
        numeros[0] = sc.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
        numeros[1] = sc.nextInt();
		
		System.out.println("Digite o terceiro número inteiro: ");
        numeros[2] = sc.nextInt();
		
		int maisAlto = numeros[0];
		
		for(int i = 1; i < numeros.length; i++) {
			if(numeros[i] > maisAlto) {
				maisAlto = numeros[i];
			}
		}
		
		System.out.println("O número mais alto é: " + maisAlto);
		
		sc.close();
	}

}
