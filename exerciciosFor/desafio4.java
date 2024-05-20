package exerciciosFor;

import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.println("Digite o valor de y: ");
        int y = sc.nextInt();

        int resultado = 1;

        for (int i = 1; i <= y; i++) {
            resultado *= x;
        }

        System.out.println("O valor de " + x + "^" + y + " é: " + resultado);

        sc.close();
    }

}
