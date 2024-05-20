package exerciciosVariaveis;

import java.util.Scanner;

public class Exercicios6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = leia.nextDouble();

        double salarioLiquido = calcularSalarioLiquido(salarioBruto);

        System.out.println("\nO salário líquido após o desconto de 10% é: " + salarioLiquido);
    }

    public static double calcularSalarioLiquido(double salarioBruto) {
        double desconto = 0.10;
        double salarioLiquido = salarioBruto * (1 - desconto);

        return salarioLiquido;
    }
}