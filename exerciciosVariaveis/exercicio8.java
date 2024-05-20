package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira idade: ");
		int idadeUm = sc.nextInt();
		
		System.out.println("Digite a segunda idade: ");
		int idadeDois = sc.nextInt();
		
		
//		if(idadeUm > idadeDois) {
//			System.out.println("Primeira idade mais velha");
//		}else if (idadeUm == idadeDois){
//			System.out.println("Idades iguais");
//		}else {
//			System.out.println("Segunda idade mais velha");
//		}
//			
//		if(idadeDois > 18) {
//			System.out.println("Segunda idade maior de idade");
//		}else {
//			System.out.println("Segunda idade menor de idade");
//		}
		
		String mensagem = (idadeUm > idadeDois) ? "Primeira idade mais velha" : (idadeUm == idadeDois) ? "Idades iguais" : "Segunda idade mais velha";
		System.out.println(mensagem);

		String maioridade = (idadeDois > 18) ? "Segunda idade maior de idade" : "Segunda idade menor de idade";
		System.out.println(maioridade);
		
		sc.close();
	}

}
