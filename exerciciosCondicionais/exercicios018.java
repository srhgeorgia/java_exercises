package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = sc.nextInt();

		String resultado = (numero >= 0) ? "Positivo" : "Negativo";

		System.out.println("O número é: " + resultado);

		sc.close();
	}

}
