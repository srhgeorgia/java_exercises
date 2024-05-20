package exerciciosCondicionais;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 System.out.println("Digite um número inteiro: ");
		 int numero = leia.nextInt();
		 
		 if(numero % 2 == 0) {
			 System.out.println("\nSeu número, " + numero + " é par");
		 }else {
			 System.out.println("\nSeu número, " + numero + " é ímpar");
		 }

	}

}
