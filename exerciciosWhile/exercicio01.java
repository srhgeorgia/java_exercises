package exerciciosWhile;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em celsius: \n");
		double C = sc.nextDouble();
		double F = (9 * C / 5.0) + 32;
		System.out.println("Equivalente em Fahrenheit \n" + F);
		System.out.println("Deseja repetir? [S/N]");
		char resposta = sc.next().charAt(0);

		while (resposta != 'N') {
			System.out.println("Digite a temperatura em celsius: \n");
			C = sc.nextDouble();
			F = (9 * C / 5.0) + 32;
			System.out.println("Equivalente em Fahrenheit \n" + F);
			System.out.println("Deseja repetir? [S/N]");
			resposta = sc.next().charAt(0);
		}

		if (resposta == 'N') {
			System.out.println("Até mais!");
		}

		sc.close();
	}

}
