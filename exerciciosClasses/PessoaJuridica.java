package exerciciosClasses;

public class PessoaJuridica extends Contribuinte{
	private int numeroFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public double calcularImposto() {
        if (numeroFuncionarios > 10) {
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }
}
