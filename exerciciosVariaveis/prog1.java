package exerciciosVariaveis;

public class prog1 {

	public static void main(String[] args) {

		int numero1 = 5;
		int numero2 = 3;
		int numero3 = 8;
		double numero4 = 8.0;
		
		double divisaoNumeros = (double) numero1 / numero2; 
		System.out.println("result division: " + divisaoNumeros);
		
		System.out.printf("result with 4 decimal houses: %.4f%n", divisaoNumeros);
		
		String numeroString = String.valueOf(divisaoNumeros);
		System.out.println("in String: " + numeroString);

		Double numeroDouble = Double.parseDouble(numeroString);
		System.out.println("in Double: " + numeroDouble);
		
		System.out.println(" ---- ");
		
		boolean resultEqual = (numero1 == numero2);
		System.out.println("result 5 equal 3: " + resultEqual);
		
		boolean resultNotEqual = (numero1 != numero2);
		System.out.println("resultado 5 not equal 3: " +  resultNotEqual);
		
		boolean biggerThen = (numero1 <= numero2);
		System.out.println("result 3 bigger than 5: " + biggerThen);
		System.out.printf("result 3 bigger than on format: %b%n", biggerThen);
		
		biggerThen = (numero1 >= numero2);
		System.out.println("result 5 bigger than 3: " + biggerThen);
		
		System.out.println(" ---- ");
		
		boolean intAndDouble = (numero3 == numero4);
		System.out.println("result integer 8 and double 8.0 are equal: " + intAndDouble);
		
		intAndDouble = (numero3 != numero4);
		System.out.println("result integer 8 and double 8.0 are not equal: " + intAndDouble);
	
		System.out.println(" ---- ");
		
		boolean doorOr = (5 > 2 || 4 < 3);
		System.out.println("result door or 5 bigger than 2 (stop on the first attempt): " + doorOr);
	
		boolean doorAnd = (5 > 2 && 4 < 3);
		System.out.println("result door and 5 bigger 2 AND 4 less than 3: " + doorAnd);
	}

}
