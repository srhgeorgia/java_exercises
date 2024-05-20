package exerciciosVetores;

import java.util.Scanner;

public class Prog08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos");
		int numAlunos = sc.nextInt();
		
		String[] nomes = new String[numAlunos];
		int[] nota1 = new int[numAlunos];
		int[] nota2 = new int[numAlunos];
		int[] nota3 = new int[numAlunos];
		
		for ( int i = 0; i < nomes.length ; i++  ) {
			
			// Limpando o Buffer
			sc.nextLine();
			
			
			System.out.println("Digite o nome do aluno");
			nomes[i] = sc.nextLine();			
			
			System.out.println("Digite a primeira nota");
			nota1[i] = sc.nextInt();
			
			System.out.println("Digite a segunda nota");
			nota2[i] = sc.nextInt();
			
			System.out.println("Digite a terceira nota");
			nota3[i] = sc.nextInt();			
		}
		System.out.println("Nome\t\tNota1\tNota2\tNota3");
		for ( int i = 0; i < nomes.length ; i++  ) {
			System.out.println(nomes[i]+"\t\t"+nota1[i]+"\t"+nota2[i]+"\t"+nota3[i]);
		}		
		sc.close();
		
		
		
		
		
		
		
		

	}

}
