package exerciciosVariaveis;

import java.util.Scanner;

public class Exercicios4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = leia.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = leia.nextDouble();

        double area = calcularAreaRetangulo(base, altura);

        System.out.println("\nA área do retângulo é: " + area);
    }

    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }
}