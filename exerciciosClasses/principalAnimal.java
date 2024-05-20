package exerciciosClasses;

public class principalAnimal {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Golden Retriever", 5, "Rex");
		Gato gato = new Gato("Siamês", 3, "Mia");
		Passaro passaro = new Passaro("Canário", 2, "Piu");

		cachorro.emitirSom();
		gato.emitirSom();
		passaro.emitirSom();
	}
}
