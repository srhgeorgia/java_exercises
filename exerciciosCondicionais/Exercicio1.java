package exerciciosCondicionais;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		
		if(idade >=18) {
			System.out.println("Parabens, ja pode dirigir");
		}else{
			System.out.println("Ainda não tem idade para beber");
		}
		
	}

}
