package exerciciosVetores;

import java.util.Scanner;

public class Prog13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do elemento que você quer adicionar");
		int elemento = sc.nextInt();		
		int[] vetor = new int[10];
		int tamanho = vetor.length;
		vetor[0] = 10;
		vetor[1] = 20;
		vetor[2] = 30;
		vetor[3] = 40;
		vetor[4] = 50;
		vetor[5] = 60;
		vetor[6] = 70;
		vetor[7] = 80;
		vetor[8] = 90;		
		int posicaoInserir = 0;		
		System.out.println("Vetor Original");
		for (int element : vetor) {
			System.out.print(element + " ");
		}
		
		
		System.out.println("Vetor Atualizado");
		for (int element : vetor) {
			System.out.print(element + " ");
		}
		
		

	}

}
