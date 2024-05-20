package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = leia.nextInt();

        System.out.println("Qual seu peso?");
        double peso = leia.nextDouble();

        System.out.println("Você fez alguma tatuagem no último ano (VERDADEIRO(true) ou FALSO(false)?");
        boolean fezTatuagem = leia.nextBoolean();

        System.out.println("Você ingeriu álcool nas últimas 12 horas (VERDADEIRO(true) ou FALSO(false)?");
        boolean ingeriuAlcool = leia.nextBoolean();

        if (idade >= 19 && idade <= 69 && peso >= 50 && !fezTatuagem && !ingeriuAlcool) {
            System.out.println("Parabéns, você pode doar sangue.");
        } else {
            System.out.println("Infelizmente, você não pode ser doador.");
        }
    }
}