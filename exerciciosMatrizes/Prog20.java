package exerciciosMatrizes;

public class Prog20 {

	public static void main(String[] args) {
		double[][] notasAlunos = { 
				{8.5 , 7.0, 9.3},
				{7.5 , 9.0, 9.3},
				{6.5 , 7.0, 8.3}           
			};
		
		for (int i = 0; i < notasAlunos[0].length; i++) {			
			for (int j = 0; j < notasAlunos.length ; j++) {
				System.out.print(notasAlunos[j][i] + " ");
			}
			System.out.println();			
		}
		
		System.out.println();	
		for (int i = 0; i < notasAlunos.length; i++) {			
			for (int j = 0; j < notasAlunos[0].length ; j++) {
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();			
		}

	}

}
