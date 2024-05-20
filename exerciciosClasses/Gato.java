package exerciciosClasses;

public class Gato extends Animal {
    public Gato(String raça, int idade, String nome) {
        super(raça, idade, nome, "Miau");
    }

    @Override
    public void emitirSom() {
        System.out.println("Raça " + getRaça() + ", com nome " + getNome() + ", mia: " + getSom());
    }
}