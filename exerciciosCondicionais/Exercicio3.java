package exerciciosCondicionais;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome: ");
		String nome = leia.nextLine();
		
		System.out.println("\nDigite seu sexo: (1- para masculino, 2- para feminino, 3- para nao binario) ");
        char genero = leia.next().charAt(0);
		
		if(genero == '1') {
			System.out.println("\nBom dia senhor, " + nome);
		}else if(genero == '2') {
			System.out.println("\nBom dia senhora, " + nome);
		}else if (genero == '3') {
			System.out.println("\nBom dia senhore, " + nome);
		}
		
	}

}
