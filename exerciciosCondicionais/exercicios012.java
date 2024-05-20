package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da variável a: ");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor da variável b: ");
		int b = sc.nextInt();
				
		if(a > b) {
			System.out.println("Valor de A: " + a + "; Valor de B: " + b + "; Maior: " + a);
		}else {
			System.out.println("Valor de A: " + a + "; Valor de B: " + b + "; Maior: " + b);
		}
		
		sc.close();
	}

}
