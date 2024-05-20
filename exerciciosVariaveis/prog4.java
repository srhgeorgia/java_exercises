package exerciciosVariaveis;

import java.util.Locale;
import java.util.Scanner;

public class prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		
		double raizQuadrada = Math.sqrt(25);
		System.out.println(raizQuadrada);
		
		double potencia = Math.pow(2, 3);
		System.out.println(potencia);
		
		int valorAbsoluto = Math.abs(-5);
		System.out.println(valorAbsoluto);
		
		double arredondarCima = Math.ceil(10.5);
		System.out.println(arredondarCima);
		
		double arredondarBaixo = Math.floor(10.5);
		System.out.println(arredondarBaixo);
		
		int maximo = Math.max(10, 20);
		System.out.println(maximo);
		
		int minimo = Math.min(10, 20);
		System.out.println(minimo);
		
		double numeroRandom = Math.random();
		System.out.println(numeroRandom);
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número flutuente (double): ");
		double numero = sc.nextDouble();
		
		System.out.println(numero);

		sc.close();
	}

}
