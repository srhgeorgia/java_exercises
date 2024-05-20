package exerciciosMatrizes;

public class Prog19 {

	public static void main(String[] args) {
		
		double[][] notasAlunos = { 
				{8.5 , 7.0, 9.3},
				{7.5 , 9.0, 9.3},
				{6.5 , 7.0, 8.3}           
			};
		
		// Fazendo a média dos alunos
		// As notas de um aluno especifico está em uma linha
		for (int i = 0; i < notasAlunos.length; i++) {
			double soma = 0;
			for (int j = 0; j < notasAlunos[0].length; j++) {
				soma = soma + notasAlunos[i][j];
			}	
			double media = soma/notasAlunos[0].length;
			System.out.println("Média do aluno " + (i+1) + ": "+media );
			System.out.printf( "%.2f" ,  media);
		
			
		}
		
		System.out.println();
		double valor = 20.6666;		
		String mediaSS = String.format("%.3f",valor);				
		System.out.println(mediaSS);
		
		
		

	}

}
