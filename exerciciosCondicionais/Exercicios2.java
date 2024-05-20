package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicios2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leia.nextInt();

        if (numero > 0) {
            System.out.println("O número digitado é positivo.");
        } else if (numero < 0) {
            System.out.println("O número digitado é negativo.");
        } else {
            System.out.println("O número digitado é zero.");
        }
    }
}