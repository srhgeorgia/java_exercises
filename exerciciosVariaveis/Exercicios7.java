package exerciciosVariaveis;
import java.util.Scanner;

public class Exercicios7 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o raio do cilindro: ");
        double raio = leia.nextDouble();

        System.out.print("Digite a altura do cilindro: ");
        double altura = leia.nextDouble();

        double areaBase = calcularAreaBase(raio);
        double areaLateral = calcularAreaLateral(raio, altura);
        double areaTotal = calcularAreaTotal(areaBase, areaLateral);
        double volume = calcularVolume(raio, altura);

        System.out.println("\nÁrea da base: " + areaBase);
        System.out.println("\nÁrea lateral: " + areaLateral);
        System.out.println("\nÁrea total: " + areaTotal);
        System.out.println("\nVolume: " + volume);
    }

    public static double calcularAreaBase(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public static double calcularAreaLateral(double raio, double altura) {
        return 2 * Math.PI * raio * altura;
    }

    public static double calcularAreaTotal(double areaBase, double areaLateral) {
        return 2 * areaBase + areaLateral;
    }

    public static double calcularVolume(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}
