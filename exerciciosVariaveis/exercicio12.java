package exerciciosVariaveis;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu número de funcionário: ");
		int funcionario = sc.nextInt();
		
		System.out.println("Digite suas horas trabalhadas: ");
		double horas = sc.nextDouble();
		
		System.out.println("Digite o valor que recebe por hora: ");
		double valor = sc.nextDouble();
		
		double salario = horas * valor;
		
		System.out.println("Número do funcionário: " + funcionario);
		System.out.printf("Salário: R$ %.2f%n", salario);

		sc.close();
	}

}
