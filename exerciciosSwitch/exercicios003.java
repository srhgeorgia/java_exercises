package exerciciosSwitch;

import java.util.Scanner;

public class exercicios003 {
//	if(dia.equals("segunda-feira") || dia.equals("terça-feira") || dia.equals("quarta-feira") || dia.equals("quinta-feira") || dia.equals("sexta-feira")) {
//	System.out.println("Dia útil na semana!");
//}else {
//	System.out.println("Final de semana! Volte outro dia.");
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome de um dia da semana: ");
		System.out.println(" ");

		String dia = sc.nextLine().toLowerCase();
		
		if(dia.equals("sabado")) {
			dia = dia.replaceFirst("a", "á");
		}
		
		if(dia.equals("terca")) {
			dia = dia.replaceFirst("c", "ç");
		}
		
		if(!dia.equals("sábado") && !dia.equals("domingo")) {
			dia += "-feira";
		}
				
		dia = Character.toUpperCase(dia.charAt(0)) + dia.substring(1);

		switch (dia) {
		case "Segunda-feira":
		case "Terça-feira":
		case "Quarta-feira":
		case "Quinta-feira":
		case "Sexta-feira":
			System.out.println(dia + " é um dia útil na semana.");
			break;
		case "Sábado":
		case "Domingo":
			System.out.println(dia + " é final de semana! Volte outro dia.");
			break;
		default:
			System.out.println("Por favor escreva um dia da semana válido!");
		}

		sc.close();
	}

}
