package exerciciosVetores;

public class Prog11 {

	public static void main(String[] args) {
		
		int[] vetor = {1,5,2,7,4,9,15,13,12};
		
		for (int i = 0; i < vetor.length -1; i++) {			
			// outro for
			for (int j = 0; j < vetor.length -1 -i; j++) {
				// condição
				if (vetor[j] > vetor[j+1]) {					
					//Trocar Elementos
					int temp = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = temp;
				}
			}			
			
		}
		
		System.out.println("Vetor ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + ", ");
		}

	}

}
