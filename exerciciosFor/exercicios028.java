package exerciciosFor;

import java.util.Scanner;

public class exercicios028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (int empregado = 1; empregado <= 3; empregado++) {
			System.out.println("Empregado " + empregado);

			System.out.print("Digite o número de horas trabalhadas: ");
			int horasTrabalhadas = sc.nextInt();

			System.out.print("Digite o salário-hora: ");
			double salarioHora = sc.nextDouble();

			double salarioBruto = calcularSalarioBruto(horasTrabalhadas, salarioHora);

			System.out.println("O salário bruto do empregado é: R$ " + salarioBruto);
			System.out.println();
		}

		sc.close();
	}

	private static double calcularSalarioBruto(int horasTrabalhadas, double salarioHora) {
		int horasNormais = Math.min(horasTrabalhadas, 40);
		int horasExtras = Math.max(horasTrabalhadas - 40, 0);

		double salarioBruto = (horasNormais * salarioHora) + (horasExtras * 1.5 * salarioHora);

		return salarioBruto;
	}
}