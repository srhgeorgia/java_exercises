package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número é: " + resultado);

        sc.close();
	}

}
