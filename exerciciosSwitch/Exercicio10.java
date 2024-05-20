package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o mês em formato numérico:");
        int numeroMes = leia.nextInt();

        String nomeMes = obterNomeMes(numeroMes);

        if (nomeMes != null) {
            System.out.println(nomeMes);
        } else {
            System.out.println("Número de mês inválido. Por favor, digite um número de 1 a 12.");
        }
    }

    private static String obterNomeMes(int numeroMes) {
        String nomeMes = null;

        switch (numeroMes) {
            case 1:
                nomeMes = "JANEIRO";
                break;
            case 2:
                nomeMes = "FEVEREIRO";
                break;
            case 3:
                nomeMes = "MARÇO";
                break;
            case 4:
                nomeMes = "ABRIL";
                break;
            case 5:
                nomeMes = "MAIO";
                break;
            case 6:
                nomeMes = "JUNHO";
                break;
            case 7:
                nomeMes = "JULHO";
                break;
            case 8:
                nomeMes = "AGOSTO";
                break;
            case 9:
                nomeMes = "SETEMBRO";
                break;
            case 10:
                nomeMes = "OUTUBRO";
                break;
            case 11:
                nomeMes = "NOVEMBRO";
                break;
            case 12:
                nomeMes = "DEZEMBRO";
                break;
        }

        return nomeMes;
    }
}