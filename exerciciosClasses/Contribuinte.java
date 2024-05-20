package exerciciosClasses;

public class Contribuinte {
    private String nome;
    private double rendaAnual;

    public Contribuinte(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }
}
