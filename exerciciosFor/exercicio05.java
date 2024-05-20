package exerciciosFor;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String minhaString = "Java é incrível";
		System.out.println("Usando loop for: ");
				
		for(int i = 0; i < minhaString.length(); i++) {
			char caractere = minhaString.charAt(i);
			System.out.println(caractere);
		}
		
		char letra = 'R';
		String letraString = String.valueOf(letra);
		System.out.println(letraString);
	}

}
