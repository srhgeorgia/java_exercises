package exerciciosFor;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite a quantidade de valores inteiros a serem lidos (N): ");
        int N = sc.nextInt();

        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor inteiro X: ");
            int X = sc.nextInt();

            if (X >= 10 && X <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.println("IN " + dentroIntervalo);
        System.out.println("OUT " + foraIntervalo);

        sc.close();
    }

}
