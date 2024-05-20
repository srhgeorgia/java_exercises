package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma letra do alfabeto: ");
		String letra = sc.nextLine().toLowerCase();
		
		String vogal = "aeiou";
		
		if(vogal.contains(letra)) {
			System.out.println("Sua letra é uma vogal.");
		}else {
			System.out.println("Sua letra é uma consoante.");
		}
		
		sc.close();
	}

}
