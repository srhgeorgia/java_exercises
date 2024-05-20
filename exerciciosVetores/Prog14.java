package exerciciosVetores;

public class Prog14 {

	public static void main(String[] args) {
		
		int[] vetor = {2,4,7,9,12,15};
		int tamanho = vetor.length;
		System.out.println("Vetor Original");
		for (int element : vetor) {
			System.out.print(element + " ");
		}
		
		int elementoRemover = 9;
		
		int posicaoRemover = -1;
		for (int i = 0; i < tamanho; i++) {
			if (vetor[i] == elementoRemover) {
				posicaoRemover = i;
				break;
			}
		}
		
		if (posicaoRemover != -1) {
			
			for (int i = posicaoRemover; i < tamanho -1; i++ ) {
				vetor[i] = vetor[i+1];
				
			}
			
			vetor[tamanho -1] = 0;
			
		}
		
		System.out.println();
		System.out.println("Vetor Atualizado");
		for (int element : vetor) {
			System.out.print(element + " ");
		}
		
		
		
		
 		
		

	}

}
