package exerciciosFor;

import java.util.Scanner;

public class desafio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 5 números de 1 a 30: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        int numero4 = sc.nextInt();
        int numero5 = sc.nextInt();

        int[] numeros = {numero1, numero2, numero3, numero4, numero5};

        for (int i = 0; i < numeros.length; i++) {
            int quantidadeAsteriscos = numeros[i];

            for (int j = 0; j < quantidadeAsteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }

}
