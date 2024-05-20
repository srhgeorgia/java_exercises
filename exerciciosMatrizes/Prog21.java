package exerciciosMatrizes;

public class Prog21 {

	public static void main(String[] args) {
		// Matriz representando um mapa de assentos em um teatro (0 para assento livre,
		// 1 para assento ocupado

		int[][] mapaAssentos = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 1, 1, 1, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		// Verificando a disponibilidade de um assento na linha 2, coluna 3
		boolean assentoDisponivel = mapaAssentos[2][3] == 0;
		System.out.println("Assento na linha 2, coluna 3 está disponível? " + assentoDisponivel);
	}

}
