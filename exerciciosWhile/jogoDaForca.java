package exerciciosWhile;

import java.util.Scanner;

public class jogoDaForca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int tentativas = 0;
		int maxTentativas = 10;
		int ajudasRestantes = 2;

		StringBuilder bemVindo = new StringBuilder("Bem-vindo ao jogo da forca! \n");
		bemVindo.append("Vamos tentar adivinhar a palavra?? \n");
		System.out.println(bemVindo);

		StringBuilder regras = new StringBuilder("Ela já está definida");
		regras.append(", basta tentarmos adivinhar qual é.");
		System.out.println(regras);

		System.out.println("Você terá 10 chances, e 2 ajudas. \n");

		StringBuilder ajudas = new StringBuilder("Quando quiser, digite: ");
		ajudas.append("1: primeira ajuda; 2: segunda ajuda. \n");
		System.out.println(ajudas);
		
		String palavraChave = "CHURROS";
		StringBuilder palavraAdivinhada = new StringBuilder(palavraChave.replaceAll(".", "_"));

		while (tentativas < maxTentativas && palavraAdivinhada.toString().contains("_")) {
			System.out.println("Palavra: \n" + palavraAdivinhada );
			System.out.println("Digite uma letra ou escolha uma ajuda (1 ou 2): ");
			char entrada = sc.nextLine().toUpperCase().charAt(0);

			switch (entrada) {
			case '1':
				if (ajudasRestantes > 0) {
					System.out.println(" ");
					System.out.println("Dica:  A palavra é uma comida que tem em festa junina. \n");
					ajudasRestantes--;
				} else {
					System.out.println(" ");
					System.out.println("Desculpe, você usou todas as dicas. \n");
				}
				break;

			case '2':
				if (ajudasRestantes > 0) {
					System.out.println(" ");
					System.out.println("Dica: A comida tem recheio e calda.");
					ajudasRestantes--;
				} else {
					System.out.println(" ");
					System.out.println("Desculpe, você usou todas as dicas.");
				}
				break;

			default:
				char letra = entrada;
				boolean acertou = false;

				for (int i = 0; i < palavraChave.length(); i++) {
					char caractere = palavraChave.charAt(i);
					if (letra == caractere) {
						palavraAdivinhada.setCharAt(i, letra);
						acertou = true;
					}
				}

				if (acertou) {
					System.out.println(" ");
					System.out.println("Parabéns, acertou a letra!");
				} else {
					System.out.println(" ");
					System.out.println("Letra errada :(");
					tentativas++;
				}
			}

		}
		
		if (palavraAdivinhada.toString().contains("_")) {
			System.out.println(" ");
			System.out.println("Você perdeu! A palavra era: " + palavraChave);
		} else {
			System.out.println("Parabéns, você acertou a palavra: " + palavraChave);
		}

		sc.close();
	}

}
