package exerciciosClasses;

public class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasTrabalhadas * valorHora);
    }
}