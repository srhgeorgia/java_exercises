package exerciciosFor;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número positivo: ");
		int N = sc.nextInt();
		
		for(int i = 0; i <= N; i++) {
			int quadrado = i * i;
            int cubo = i * i * i;

            System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		
		sc.close();
	}

}
