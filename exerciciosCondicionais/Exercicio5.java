package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe as medidas dos três lados do triângulo:");

        System.out.print("Lado 1: ");
        double lado1 = leia.nextDouble();

        System.out.print("Lado 2: ");
        double lado2 = leia.nextDouble();

        System.out.print("Lado 3: ");
        double lado3 = leia.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("\nTrata-se de um triângulo equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("\nTrata-se de um triângulo isósceles.");
        } else {
            System.out.println("\nTrata-se de um triângulo escaleno.");
        }
    }
}