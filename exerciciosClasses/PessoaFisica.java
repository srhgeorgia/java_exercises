package exerciciosClasses;

public class PessoaFisica extends Contribuinte {
	 private double gastosSaude;

	    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
	        super(nome, rendaAnual);
	        this.gastosSaude = gastosSaude;
	    }

	    @Override
	    public double getRendaAnual() {
	        return super.getRendaAnual() - gastosSaude * 0.5;
	    }

	    public double calcularImposto() {
	        double rendaAnual = getRendaAnual();
	        if (rendaAnual <= 20000.00) {
	            return rendaAnual * 0.15;
	        } else {
	            return rendaAnual * 0.25;
	        }
	    }
}
