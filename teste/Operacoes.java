package teste;

public class Operacoes {

	public static int somarNumeros(int num1, int num2) {
		return num1 + num2;
	}

	public static int somarNumeros(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public static int multiplicarNumeros(int num1, int num2) {
		return num1 * num2;
	}

	public static int dividirNumeros(int num1, int num2) {
		return num1 / num2;
	}

	public static double potenciaDeNumeros(double base, int expoente) {

		if (expoente == 0) {
			return 1;
		} else {
			double resultado = base;

			for (int i = 0; i < expoente; i++) {
				resultado *= base;
			}

			return resultado;
		}

	}

}
