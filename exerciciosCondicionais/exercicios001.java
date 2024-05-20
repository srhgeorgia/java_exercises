package exerciciosCondicionais;

import java.util.Scanner;

public class exercicios001{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor qualquer: ");
		int valor = sc.nextInt();
		
		String mensagem;
		
		if(valor >= 0 && valor <= 25) {
			mensagem = "intervalo [0,25]";
		}else if(valor > 25 && valor <= 50) {
			mensagem = "intervalo [25,50]";
		}else if(valor > 50 && valor <= 75) {
			mensagem = "intervalo [50,75]";
		}else if(valor > 75 && valor <= 100) {
			mensagem = "intervalo [75,100]";
		}else {
			mensagem = "fora do intervalo";
		}
		
		System.out.println("O valor " + valor + " está no intervalo: " + mensagem);
		
		
		sc.close();
	}

}
