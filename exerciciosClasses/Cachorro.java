package exerciciosClasses;

public class Cachorro extends Animal {
    public Cachorro(String raça, int idade, String nome) {
        super(raça, idade, nome, "Au Au");
    }

    @Override
    public void emitirSom() {
        System.out.println("Raça " + getRaça() + ", com nome " + getNome() + ", late: " + getSom());
    }
}