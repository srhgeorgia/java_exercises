package exerciciosVetores;

import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] quartosVagos = new boolean[10];
        for (int i = 0; i < 10; i++) {
            quartosVagos[i] = true;
        }

        System.out.print("Informe o número de estudantes (1 a 10): ");
        int numEstudantes = sc.nextInt();

        if (numEstudantes < 1 || numEstudantes > 10) {
            System.out.println("Número inválido de estudantes. O programa será encerrado.");
            return;
        }

        for (int i = 0; i < numEstudantes; i++) {
            System.out.println("\nRegistro de Aluguel do Estudante " + (i + 1) + ":");
            
            System.out.print("Nome do estudante: ");
            String nome = sc.next();
            
            System.out.print("Email do estudante: ");
            String email = sc.next();
            
            int quartoEscolhido;
            do {
                System.out.print("Escolha um quarto (de 0 a 9): ");
                quartoEscolhido = sc.nextInt();
            } while (quartoEscolhido < 0 || quartoEscolhido > 9 || !quartosVagos[quartoEscolhido]);

            quartosVagos[quartoEscolhido] = false;

            System.out.println("\nAluguel registrado com sucesso:");
            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Quarto escolhido: " + quartoEscolhido);
        }

        System.out.println("\nRelatório de Ocupações:");
        for (int i = 0; i < 10; i++) {
            if (!quartosVagos[i]) {
                System.out.println("Quarto " + i + ": Ocupado");
            }
        }
        
    }
}
