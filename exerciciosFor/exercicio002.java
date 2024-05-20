package exerciciosFor;

import java.util.Scanner;

public class exercicio002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas: ");
		int notas = sc.nextInt();
		
		int soma = 0;
		
		for(int i = 1; i<= notas; i++){
			System.out.println("Digite a primeira nota: " + i + "° ");
			int nota = sc.nextInt();
			soma += nota;
		}
		
		double media = (double) soma / notas;
		System.out.println("A média do aluno é: " + media);
		sc.close();
	}

}
