package exerciciosCondicionais;

import java.time.LocalDate;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        LocalDate data1 = lerData(leia, "primeira data: ");
        LocalDate data2 = lerData(leia, "segunda data: ");

        exibirDatasEmOrdemCrescente(data1, data2);
    }

    private static LocalDate lerData(Scanner leia, String ordem) {
        int dia, mes, ano;

    	 while (true) {
             try {
                 System.out.println("\nDigite o dia da " + ordem);
                 dia = leia.nextInt();

                 System.out.println("\nDigite o mês da " + ordem);
                 mes = leia.nextInt();

                 System.out.println("\nDigite o ano da " + ordem);
                 ano = leia.nextInt();

                 return LocalDate.of(ano, mes, dia);
             } catch (DateTimeException e) {
                 System.out.println("\nData inválida. Tente novamente.");
                 leia.nextLine();
             }
         }
     }
    

    private static void exibirDatasEmOrdemCrescente(LocalDate data1, LocalDate data2) {
        if (data1.isBefore(data2)) {
        	System.out.println("\n");
            System.out.println(formatarData(data1) + ", " + formatarData(data2));
        } else {
        	System.out.println("\n");
            System.out.println(formatarData(data2) + ", " + formatarData(data1));
        }
    }

    private static String formatarData(LocalDate data) {
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
