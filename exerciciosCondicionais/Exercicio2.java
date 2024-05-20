package exerciciosCondicionais;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double primeiraNota = leia.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double segundaNota = leia.nextDouble();
		
		double media = (primeiraNota + segundaNota) / 2;
		
		if(media >= 7) {
			System.out.println("\nParabens, voce foi aprovado com média: " + media);
		}else {
			System.out.println("\nInfelizmente voce não foi aprovado com a média: " + media);
		}
	}

}
