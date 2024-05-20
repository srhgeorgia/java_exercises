package exerciciosFor;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;

		for (int i = 1; i <= 100; i++) {
			soma += i++;
		}

		System.out.println("A soma dos números de 1 a 100 é: " + soma);
	}

}
