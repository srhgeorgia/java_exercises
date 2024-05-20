package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicios9 {

    public static void main(String[] args) {
    	
    	Scanner leia = new Scanner(System.in);

    	System.out.println("\nDigite sua nota: ");
    	double nota = leia.nextInt();
    	
    	if ( (nota >= 0 ) && (nota < 6) ) {
    		System.out.println("seu conceito é insuficiente");
    	}else if( (nota >= 6) && (nota < 7)) {
    		System.out.println("Seu conceito é regular");
    	}else if ( (nota >= 7) && (nota <8) ) {
    		System.out.println("Seu conceito é bom");
    	}else if( (nota >=8) && (nota <= 9)) {
    		System.out.println("Seu conceito está quase lá");
    	}else {
    		System.out.println("Seu conceito é excelente");
    	}
    	
    }
}
