package exerciciosVetores;

public class Prog01 {

	public static void main(String[] args) {

		int[] vetor;
		vetor = new int[5];

		// Atribuindo o valor 10 na posição 0 do vetor
		vetor[0] = 10;
		vetor[1] = 5;
		vetor[2] = 33;
		vetor[3] = 40;
		vetor[4] = 55;

		int comprimentoVetor = vetor.length;
		System.out.println("O comprimento do vetor é: " + comprimentoVetor);

		System.out.println(vetor);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Posição " + i + " Valor: " + vetor[i]);
		}
		
		
		// Inicialização direta
		int[] vetor3 = { 1, 10, 20, 5, 6, 8, 9, 88, 99, 2 };
		System.out.println(vetor3.length);

		String[] listaProdutos = { "Computador", "Mouse", "Teclado", "RAM" };

		listaProdutos[1] = "Monitor";

		if (listaProdutos[1].equals("Mouse")) {
			System.out.println("Simmmm");
		} else {
			System.out.println("Nãooo");
		}

		for (int i = 0; i < listaProdutos.length; i++) {
			System.out.println(listaProdutos[i]);
		}

	}

}
