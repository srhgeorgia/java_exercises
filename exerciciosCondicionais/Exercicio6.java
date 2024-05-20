package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.print("Qual seu peso em quilogramas? ");
        double peso = leia.nextDouble();

        System.out.print("Qual sua altura em metros? ");
        double altura = leia.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC = " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Acima do peso");
        }
    }
}