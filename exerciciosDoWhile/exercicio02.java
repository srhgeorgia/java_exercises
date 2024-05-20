package exerciciosDoWhile;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char resposta;
		do {
			System.out.println("Digite a temperatura em celsius: \n");
			double C = sc.nextDouble();
			double F = (9 * C / 5.0) + 32;
			System.out.println("Equivalente em Fahrenheit \n" + F);
			System.out.println("Deseja repetir? [S/N]");
			resposta = sc.next().charAt(0);
		} while (resposta != 'N');

		if (resposta == 'N') {
			System.out.println("Até mais!");
		}

		sc.close();
	}

}
