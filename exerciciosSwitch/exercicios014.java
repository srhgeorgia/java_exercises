package exerciciosSwitch;

import java.util.Scanner;

public class exercicios014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um número de 1 a 12: ");
		int numeroMes = sc.nextInt();

		String nomeMes;
		int numeroDias;

		switch (numeroMes) {
		case 1:
			nomeMes = "Janeiro";
			numeroDias = 31;
			break;
		case 2:
			nomeMes = "Fevereiro";
			numeroDias = 28; 
			break;
		case 3:
			nomeMes = "Março";
			numeroDias = 31;
			break;
		case 4:
			nomeMes = "Abril";
			numeroDias = 30;
			break;
		case 5:
			nomeMes = "Maio";
			numeroDias = 31;
			break;
		case 6:
			nomeMes = "Junho";
			numeroDias = 30;
			break;
		case 7:
			nomeMes = "Julho";
			numeroDias = 31;
			break;
		case 8:
			nomeMes = "Agosto";
			numeroDias = 31;
			break;
		case 9:
			nomeMes = "Setembro";
			numeroDias = 30;
			break;
		case 10:
			nomeMes = "Outubro";
			numeroDias = 31;
			break;
		case 11:
			nomeMes = "Novembro";
			numeroDias = 30;
			break;
		case 12:
			nomeMes = "Dezembro";
			numeroDias = 31;
			break;
		default:
			nomeMes = "Mês inválido";
			numeroDias = 0;
		}

		System.out.println("O mês de " + nomeMes + " tem " + numeroDias + " dias.");

		sc.close();
	}

}
