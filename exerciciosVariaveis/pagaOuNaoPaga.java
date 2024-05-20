package exerciciosVariaveis;

import java.util.Scanner;

public class pagaOuNaoPaga {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		double salario = sc.nextDouble();
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		sc.close();
		
		boolean pagaImposto = (salario >= 1200) && (idade >= 18);
		
		System.out.println(" ");
		System.out.println("-----TERNÁRIO------");
		
		String result = salario >= 1200 && idade >= 18 ? "Paga imposto!" : "Não paga imposto!";
		System.out.println(result);
		sc.close();

		System.out.println(" ");
		System.out.println("-----IF AND ELSE-----");
		
		if (pagaImposto) {
			System.out.println("Salário maior que 1200 e idade maior que 18: Paga imposto!");
		}else{
			System.out.println("Salário menor que 1200 e idade menor que 18: Não precisa pagar imposto!");
		}

	}

}
