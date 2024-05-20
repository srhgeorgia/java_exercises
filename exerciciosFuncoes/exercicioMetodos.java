package exerciciosFuncoes;

import java.util.Arrays;

public class exercicioMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = { 0, 2, 6, 93, 1, 5, 15, 3, 50, 42 };
		int elementoProcurado = 15;
		int elementoParaRemover = 2;
		int elementoaInserir = 14;
		int posicao = -1;
		int soma = 0;

		// SOMAR ELEMENTOS
		int elementosSomados = Metodos.somarElementos(vetor, soma);
		System.out.println("Elementos somados: " + elementosSomados);
		System.out.println(" ");

		// INSERIR ELEMENTOS
		int[] vetorComNovoValor = Metodos.inserirValor(vetor, elementoaInserir, posicao);
		System.out.println("Vetor com novo valor: " + Arrays.toString(vetorComNovoValor));
		System.out.println(" ");

		// ORDENAR ELEMENTOS
		int[] vetorOrdenado = Metodos.ordenarElementos(vetor);
		System.out.println("Vetor ordenado: " + Arrays.toString(vetorOrdenado));
		System.out.println(" ");

		// BUSCA LINEAR
		System.out.println("Busca linear: ");
		int indice = Metodos.buscaLinear(vetor, elementoProcurado, posicao);
		if (indice != -1) {
			System.out.println("O elemento " + elementoProcurado + " foi encontrado no índice " + indice + ".");
		} else {
			System.out.println("O elemento " + elementoProcurado + " não foi encontrado no vetor.");
		}
		System.out.println(" ");

		// BUSCA BINARIA
		System.out.println("Busca binária: ");
		int indiceBinaria = Metodos.buscaBinaria(vetor, elementoProcurado, posicao);
		if (indiceBinaria != -1) {
			System.out.println("O elemento " + elementoProcurado + " foi encontrado no índice " + indice + ".");
		} else {
			System.out.println("O elemento " + elementoProcurado + " não foi encontrado no vetor.");
		}
		System.out.println(" ");

		// DELETAR VALOR
		int[] posicaoRemocao = Metodos.deletarValor(vetor, elementoParaRemover, posicao);
		System.out.println("Deletando valor: " + Arrays.toString(posicaoRemocao));
		if (posicao != -1) {
			for (int i = posicao; i < vetor.length - 1; i++) {
				vetor[i] = vetor[i + 1];
			}
			vetor[vetor.length - 1] = 0;
		}
		
		
		
		// ORDENANDO COM 0
		System.out.println(" ");
		int[] vetorOrdenadoComZeroNoFinal = Metodos.ordenarElementosComZeroNoFinal(vetor, posicao);
		System.out.println("Vetor ordenado com 0 no final: " + Arrays.toString(vetorOrdenadoComZeroNoFinal));
	}

}
