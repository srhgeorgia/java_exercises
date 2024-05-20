package exerciciosFuncoes;

public class Metodos {

	public static int somarElementos(int[] vetor, int soma) {
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}

	public static int buscaLinear(int[] vetor, int numero, int posicao) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				posicao = i;
				break;
			}
		}
		return posicao;
	}

	public static int buscaBinaria(int[] vetor, int numero, int posicao) {
		vetor = ordenarElementos(vetor);

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				posicao = i;
				break;
			}
		}
		return posicao;
	}

	public static int[] inserirValor(int[] vetor, int numero, int posicao) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > numero || vetor[i] == 0) {
				posicao = i;
				break;
			}
		}
		for (int i = vetor.length - 1; i > posicao; i--) {
			vetor[i] = vetor[i - 1];
		}
		vetor[posicao] = numero;
		return vetor;
	}

	public static int[] deletarValor(int[] vetor, int numeroRemovido, int posicaoRemocao) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroRemovido) {
				posicaoRemocao = i;
				break;
			}
		}
		return vetor;
	}

	public static int[] ordenarElementos(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - i - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
			}
		}
		return vetor;
	}

	public static int[] ordenarElementosComZeroNoFinal(int[] vetor, int posicao) {

		vetor = ordenarElementos(vetor);

		// PROCURANDO ELEMENTO 0
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == 0) {
				posicao = i; // GUARDANDO O 0
				break;
			}
		}

		if (posicao != -1) {

			// POSICAO = -1 NO MAIN

			// RETIRANDO O 0
			int[] vetorSemZero = new int[vetor.length - 1];

			// COPIANDO OS ELEMENTOS ANTES DO ZERO PARA O VETOR SEM ZERO
			for (int i = 0; i < posicao; i++) {
				vetorSemZero[i] = vetor[i];
			}

			// COPIANDO ELEMENTOS APÓS O ZERO PARA O VETOR SEM ZERO
			for (int i = posicao + 1, j = posicao; i < vetor.length; i++, j++) {
				vetorSemZero[j] = vetor[i];
			}

			// ORDENANDO O VETOR SEM ZERO COM (BUBBLE SORT - LOGICA PROFESSOR)
			for (int i = 0; i < vetorSemZero.length; i++) {
				for (int j = 0; j < vetorSemZero.length - i - 1; j++) {
					if (vetorSemZero[j] > vetorSemZero[j + 1]) {
						int temp = vetorSemZero[j];
						vetorSemZero[j] = vetorSemZero[j + 1];
						vetorSemZero[j + 1] = temp;
					}
				}
			}

			int[] vetorOrdenadoComZeroNoFinal = new int[vetor.length];

			// COPIANDO OS ELEMENTOS ORDENADOS DO VETOR SEM ZERO PARA O VETOR ORDENADO COM O
			// ZERO
			for (int i = 0; i < vetorSemZero.length; i++) {
				vetorOrdenadoComZeroNoFinal[i] = vetorSemZero[i];
			}
			vetorOrdenadoComZeroNoFinal[vetorOrdenadoComZeroNoFinal.length - 1] = 0;
			return vetorOrdenadoComZeroNoFinal;

		} else {
			return vetor;
		}

	}
}
