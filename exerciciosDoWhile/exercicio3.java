package exerciciosDoWhile;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao sistema de escolha de combustível! \n");
	
		
		int quantidadeClientesAlcool = 0;
		int totalDeVezesAlcool = 0;
		
		int quantidadeClientesGasolina = 0;
		int totalDeVezesGasolina = 0;
		
		int quantidadeClientesDiesel = 0;
		int totalDeVezesDiesel = 0;
		
		int opcao;
		
		do {
			System.out.println("Digite o código do combustível abastecido: ");
			System.out.println("1: Álcool; 2: Gasolina; 3: Diesel; ou 4: para sair; \n");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				totalDeVezesAlcool++;
				quantidadeClientesAlcool++;
				break;
			case 2:
				totalDeVezesGasolina++;
				quantidadeClientesGasolina++;
				break;
			case 3:
				totalDeVezesDiesel++;
				quantidadeClientesDiesel++;
				break;
			case 4:
				break;
			default:
				System.out.println("Opção inválida, digite outro código. \n");
			}
		} while(opcao != 4);
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Álcool = Clientes: " + quantidadeClientesAlcool + "; Total de vezes abastecidas: " + totalDeVezesAlcool);
		System.out.println("Gasolina = Clientes: " + quantidadeClientesGasolina + "; Total de vezes abastecidas: " + totalDeVezesGasolina);
		System.out.println("Diesel = Clientes: " + quantidadeClientesDiesel + "; Total de vezes abastecidas: " + totalDeVezesDiesel);

		
		sc.close();
	}

}
