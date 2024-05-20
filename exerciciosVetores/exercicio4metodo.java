package exerciciosVetores;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio4metodo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para ser inserido: ");
        int valorInserido = sc.nextInt();

        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 0};

        System.out.println("Vetor original:");
        exibirVetor(vetor);

        // Adiciona o valor ao vetor
        vetor[vetor.length - 1] = valorInserido;

        // Ordena o vetor
        Arrays.sort(vetor, 0, vetor.length);

        System.out.println("\nNovo vetor ordenado: ");
        exibirVetor(vetor);

        sc.close();
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
