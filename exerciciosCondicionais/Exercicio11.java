package exerciciosCondicionais;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int a = leia.nextInt();

        System.out.println("Digite o segundo número:");
        int b = leia.nextInt();

        System.out.println("Digite o terceiro número:");
        int c = leia.nextInt();

        int[] numeros = {a, b, c};

        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));
    }
}
