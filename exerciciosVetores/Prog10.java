package exerciciosVetores;

import java.util.Scanner;

public class Prog10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = {15,7,23,10,35,18,5};	
		
		System.out.println("Digite o elemento procurado");
		int elemento = sc.nextInt();
		
		int indiceEncontrado = 0;
		
		for (int i = 0; i < vetor.length; i++  ) {
			
			if (vetor[i] ==  elemento ) {
				indiceEncontrado = i;		
				break;
			}  else {
				indiceEncontrado = -1;
			}		
			
		}
		
		if (indiceEncontrado != -1) {
			System.out.println("O elemento " + elemento + " foi encontrado na posição " + indiceEncontrado );
			
		} else {
			System.out.println("O elemento " + elemento + "não foi encontrado no vetor");
		}
		
		sc.close();
		
		
		
		
		
		
		

	}

}
