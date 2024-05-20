package exerciciosClasses;

public class Animal {
    private String raça;
    private int idade;
    private String nome;
    private String som;

    public Animal(String raça, int idade, String nome, String som) {
        this.raça = raça;
        this.idade = idade;
        this.nome = nome;
        this.som = som;
    }

    public void emitirSom() {
        System.out.println("Raça " + raça + " com o nome " + nome + " emite o som: " + som);
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
}
