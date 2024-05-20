package exerciciosVariaveis;

import java.util.Scanner;

public class Exercicios3 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = leia.nextDouble();

        double temperaturaFahrenheit = (9.0 / 5.0 * temperaturaCelsius) + 32;
        double temperaturaKelvin = temperaturaCelsius + 273.15;
        double temperaturaRankine = (temperaturaCelsius + 273.15) * 9.0 / 5.0;

        System.out.println("\nTemperatura em Fahrenheit: " + temperaturaFahrenheit + " °F");
        
        System.out.println("\nTemperatura em Kelvin: " + temperaturaKelvin + " K");
        
        System.out.println("\nTemperatura em Rankine: " + temperaturaRankine + " °R");
    }
}