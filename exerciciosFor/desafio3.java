package exerciciosFor;

import java.util.Scanner;

public class desafio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de casos de teste: ");
		int testes = sc.nextInt();
		
		for (int i = 0; i < testes;) {
			System.out.println("Digte o conjunto de valores: ");
			
			double conjunto1 = sc.nextDouble() * 0.2;
			double conjunto2 = sc.nextDouble() * 0.3;
			double conjunto3 = sc.nextDouble() * 0.5;
  
			double mediaPonderada = conjunto1 + conjunto2 + conjunto3;
			
            System.out.printf("%.1f\n", mediaPonderada);
			break;
		}
		
		sc.close();
	}

}
