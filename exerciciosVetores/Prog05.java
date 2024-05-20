package exerciciosVetores;

public class Prog05 {

	public static void main(String[] args) {

		String[] listaPessoas = {"Maria", "Grace", "Rogerio"};
		
		// for each
		for (String pessoa : listaPessoas ) {			
			System.out.println("Nome: " + pessoa);
		}
		
		System.out.println();
		for (int i = 0; i < listaPessoas.length; i++ ) {
			System.out.println("Nome: " + listaPessoas[i]);
		}
		
		

	}

}
