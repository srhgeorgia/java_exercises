package exerciciosVetores;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = { 5, 2, 9, 1, 40, 53, 30 };

		for (int i = 0; i < vetor.length - 1; i++) {
			int indexMenorNumero = i;
			// supondo que o menor numero é o primeiro

			for (int j = i + 1; j < vetor.length; j++) {
				// percorre o vetor a partir do segundo numero porque o primeiro ja é o menor
				// entao ele compara o primeiro a partir do segundo numero

				if (vetor[indexMenorNumero] > vetor[j]) {
					// se o primeiro numero for maior que o segundo numero
					// o segundo numero passa a ser o menor numero
					indexMenorNumero = j;
				}
			}

			// guarda o numero da posição i em uma variavel temporaria
			int numeroTemporario = vetor[i];
			// troca o numero da posição i com o menor numero encontrado
			vetor[i] = vetor[indexMenorNumero];
			// coloca o numero temporario na posição do menor numero encontrado
			vetor[indexMenorNumero] = numeroTemporario;
		}

		System.out.println("Vetor ordenado: ");
		for (int i : vetor) {
			System.out.println(i);
		}
	}

}
