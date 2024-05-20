package exerciciosVetores;

import java.util.Scanner;

public class exercicios009{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor que deseja sacar: ");
		int valorSaque = sc.nextInt();

		int[] notas = { 100, 50, 50, 10, 5, 2, 1 };

		for (int nota : notas) {
			int quantidadeNotas = valorSaque / nota;
			
			if (quantidadeNotas > 0) {
				System.out.println("Número de notas de R$" + nota + ": " + quantidadeNotas);
                valorSaque %= nota;
                //valorSaque = valorSaque % nota; (resto de)
			}
		}

		sc.close();
	}

}
