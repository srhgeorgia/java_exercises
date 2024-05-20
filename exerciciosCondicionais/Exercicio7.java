package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos quilômetros o carro percorre por litro?");
        double kmPorLitro = leia.nextDouble();

        System.out.println("Quantos litros tem no carro atualmente?");
        double litrosNoCarro = leia.nextDouble();

        System.out.println("Qual distância (em Km) você deseja percorrer?");
        double distanciaDesejada = leia.nextDouble();

        double distanciaAtual = kmPorLitro * litrosNoCarro;

        if (distanciaAtual >= distanciaDesejada) {
            System.out.println("Você não precisa abastecer.");
        } else {
            double litrosNecessarios = (distanciaDesejada - distanciaAtual) / kmPorLitro;
            System.out.println("Você precisa abastecer " + litrosNecessarios + " litros.");
        }
    }
}