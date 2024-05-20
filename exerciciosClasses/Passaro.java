package exerciciosClasses;

public class Passaro extends Animal {
    public Passaro(String raça, int idade, String nome) {
        super(raça, idade, nome, "Piu Piu");
    }

    @Override
    public void emitirSom() {
        System.out.println("Raça " + getRaça() + ", com nome " + getNome() + ", canta: " + getSom());
    }
}