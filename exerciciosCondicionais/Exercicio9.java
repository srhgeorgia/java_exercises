package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe a velocidade permitida:");
        int velocidadePermitida = leia.nextInt();

        System.out.println("Informe a velocidade do motorista:");
        int velocidadeMotorista = leia.nextInt();

        double porcentagemExcesso = ((double) (velocidadeMotorista - velocidadePermitida) / velocidadePermitida) * 100;

        if (porcentagemExcesso <= 20) {
            System.out.println("(Infração média) Multa de R$85,00 + 4 pontos.");
        } else if (porcentagemExcesso <= 50) {
            System.out.println("(Infração grave) Multa de R$127,00 + 5 pontos.");
        } else {
            System.out.println("(Infração gravíssima) Multa de R$574,00 + 7 pontos + apreensão da carteira + suspensão do direito de dirigir.");
        }
    }
}