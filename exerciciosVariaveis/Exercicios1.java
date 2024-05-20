package exerciciosVariaveis;
import java.util.Scanner;

public class Exercicios1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro operador: ");
        int operadorUm = leia.nextInt();

        System.out.print("Digite o segundo operador: ");
        int operadorDois = leia.nextInt();

        int resultadoSoma = calcularSoma(operadorUm, operadorDois);
        int resultadoDivisao = calcularDivisao(operadorUm, operadorDois);
        int resultadoSubtracao = calcularSubtracao(operadorUm, operadorDois);
        int resultadoMultiplicacao = calcularMultiplicacao(operadorUm, operadorDois);

        System.out.println("\nA adição dos dois operadores é: " + resultadoSoma);

        System.out.println("\nA divisão dos dois operadores é: " + resultadoDivisao);
        
        System.out.println("\nA subtração dos dois operadores é: " + resultadoSubtracao);
        
        System.out.println("\nA multiplicação dos dois operadores é: " + resultadoMultiplicacao);
    }
    
    public static int calcularSoma(int operadorUm, int operadorDois) {
    	return operadorUm + operadorDois;
    }
    
    public static int calcularDivisao(int operadorUm, int operadorDois) {
    	return operadorUm / operadorDois;
    }
    
    public static int calcularSubtracao(int operadorUm, int operadorDois) {
    	return operadorUm - operadorDois;
    }
    
    public static int calcularMultiplicacao(int operadorUm, int operadorDois) {
    	return operadorUm * operadorDois;
    }
    
}