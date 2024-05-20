package exerciciosVetores;

import java.util.Scanner;

public class Prog09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma lista de nomes separado por virgula (,)");
		String listaNomes = sc.nextLine();		
		String[] nomes = listaNomes.split(",");
		System.out.println("Nomes separados");		
		for (String nome : nomes) {
			System.out.println(nome.trim());			
		}	
		System.out.println(listaNomes);
		sc.close();
		
		
		
		
	

	}

}
