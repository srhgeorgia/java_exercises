package exerciciosSwitch;

import java.util.Scanner;

public class exercicios019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número de 1 a 7: ");
		int numeroDia = sc.nextInt();

		String diaSemana;

		switch (numeroDia) {
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda-feira";
			break;
		case 3:
			diaSemana = "Terça-feira";
			break;
		case 4:
			diaSemana = "Quarta-feira";
			break;
		case 5:
			diaSemana = "Quinta-feira";
			break;
		case 6:
			diaSemana = "Sexta-feira";
			break;
		case 7:
			diaSemana = "Sábado";
			break;
		default:
			diaSemana = "Número inválido";
		}

		System.out.println("O dia da semana correspondente é: " + diaSemana);

		sc.close();

	}

}
