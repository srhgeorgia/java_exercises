package exerciciosVetores;

import java.util.Scanner;

public class exercicios007{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma letra do alfabeto: ");
		String letra = sc.nextLine().toLowerCase();
		
		String[] vogais = {"a", "e", "i", "o", "u"};
		
        for (String vogal : vogais) {
            if (letra.equals(vogal)) {
                System.out.println("Sua letra é uma vogal");
                break;
            }else {
                System.out.println("Sua letra é uma consoante");
                break;
            }
        }
		
		sc.close();
	}

}
