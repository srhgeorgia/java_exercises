package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicios5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leia.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leia.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = leia.nextDouble();

        double maiorNumero = encontrarMaiorNumero(numero1, numero2, numero3);

        System.out.println("\nO maior número é: " + maiorNumero);
    }

    public static double encontrarMaiorNumero(double a, double b, double c) {
        double maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        return maior;
    }
}