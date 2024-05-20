package exerciciosVariaveis;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado1 = (int) (10 % 3 * Math.pow(2, 2) + 1 - 10 * 4 / 2);
        System.out.println("Resultado da expressão 1: " + resultado1);

        // Expressão 2: 10 % (3 * 2^2) + 1 - (10 * 4 / 2)
        int resultado2 = (int) (10 % (3 * Math.pow(2, 2)) + 1 - (10 * 4 / 2));
        System.out.println("Resultado da expressão 2: " + resultado2);
		
	}

}
