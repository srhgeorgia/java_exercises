package exerciciosDoWhile;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma senha: ");

		String senhaCorreta = "CHURROS";
		String senha;

		do {
			senha = sc.nextLine().toUpperCase();

			if (senha.equals(senhaCorreta)) {
				System.out.println("Senha correta");
				break;
			}
			System.out.println("Digite outra senha: ");

		} while (!senha.equals(senhaCorreta));

		sc.close();
	}

}
