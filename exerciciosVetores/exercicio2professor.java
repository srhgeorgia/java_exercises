package exerciciosVetores;

public class exercicio2professor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = { 5, 2, 9, 1, 40, 53, 30 };

		for (int i = 0; i < vetor.length - 1; i++) {

			for (int j = 0; j < vetor.length - 1 - i; j++) {

				if (vetor[j] > vetor[j + 1]) {
					int numeroTemporario = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = numeroTemporario;

				}
			}

		}

		System.out.println("Vetor ordenado: ");
		for (int num : vetor) {
			System.out.print(num + ", ");
		}

	}

}