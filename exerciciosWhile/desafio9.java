package exerciciosWhile;

import java.util.Scanner;

public class desafio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double montanteInicial = 25000.0;

		double taxaJurosSimples = 0.05;

		double taxaJurosCompostos = 0.04;

		int tempo = 1;

		double montanteSimples = montanteInicial;
		double montanteComposto = montanteInicial;

		while (montanteSimples >= montanteComposto) {
			montanteSimples += montanteInicial * taxaJurosSimples;
			montanteComposto *= (1 + taxaJurosCompostos);

			tempo++;
		}

		System.out.printf("A partir de %d meses, a segunda opção é mais vantajosa.\n", tempo);

		sc.close();
	}

}
