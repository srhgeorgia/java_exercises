package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        if (numero > 0 && numero % 2 != 0) {
            System.out.println("O número é positivo e ímpar.");
        } else if(numero > 0 && numero % 2 == 0) {
            System.out.println("O número é positivo e par.");
        } else {
            System.out.println("O número não é positivo e ímpar.");
        }

        sc.close();
    }

}
