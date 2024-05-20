package exerciciosVariaveis;

import java.util.Random;

public class prog3 {

	public static void main(String[] args) {
	
		Random randomNum = new Random();
		
		int randomInt = randomNum.nextInt();
		System.out.println(randomInt);

		int entre0E100 = randomNum.nextInt(100);
		System.out.println(entre0E100);

		int entre5e15 = randomNum.nextInt(5, 15);
		System.out.println(entre5e15);
		
		int entreMenoseMais = randomNum.nextInt(-50, 50);
		System.out.println(entreMenoseMais);
		
		int entreMenoseMais2 = randomNum.nextInt(100) - 50;
		System.out.println(entreMenoseMais2);
		
		double randomDouble = randomNum.nextDouble();
		System.out.println(randomDouble);
		
		System.out.printf("numero aletorio com 2 casas decimais %.2f%n", randomDouble);
	}

}
