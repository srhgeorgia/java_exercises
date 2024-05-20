package exerciciosVetores;

import java.util.Arrays;

public class exercicio2metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = { 5, 1, 9, 10, 40, 53, 30 };

		Arrays.sort(vetor);

		System.out.println("Vetor ordenado: ");
		for (int i : vetor) {
			System.out.println(i);
		}
	}

}
