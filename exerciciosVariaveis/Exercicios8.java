package exerciciosVariaveis;
import java.util.Scanner;

public class Exercicios8 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a aresta do cubo: ");
        double aresta = leia.nextDouble();

        double areaTotal = calcularAreaTotalCubo(aresta);
        double volume = calcularVolumeCubo(aresta);

        System.out.println("\nÁrea total do cubo: " + areaTotal);
        System.out.println("\nVolume do cubo: " + volume);
    }

    public static double calcularAreaTotalCubo(double aresta) {
        return 6 * Math.pow(aresta, 2);
    }

    public static double calcularVolumeCubo(double aresta) {
        return Math.pow(aresta, 3);
    }
}