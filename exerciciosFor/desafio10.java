package exerciciosFor;

import java.util.Scanner;

public class desafio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma data no formato ddmmaaaa: ");
		int data = sc.nextInt();

		int dia = data / 1000000;
		int mes = (data / 10000) % 100;
		int ano = data % 10000;

		if (mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano) || ano < 1900) {
			System.out.println("Data inválida.");
		} else {
			int a = (14 - mes) / 12;
			int y = ano - a;
			int m = mes + 12 * a - 2;
			int diaDaSemana = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

			String[] diasDaSemana = { "Sábado", "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira",
					"Quinta-feira", "Sexta-feira" };
			System.out.println("O dia da semana correspondente é: " + diasDaSemana[diaDaSemana + 1]);
		}

		sc.close();
	}

	public static int diasNoMes(int mes, int ano) {
		int[] diasNoMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (ehBissexto(ano) && mes == 2) {
			return 29;
		} else {
			return diasNoMes[mes];
		}
	}

	public static boolean ehBissexto(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	}
}
