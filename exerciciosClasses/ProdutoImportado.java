package exerciciosClasses;

public class ProdutoImportado extends Produto {
	private double taxaAlfandega;

    public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public double getPreco() {
        return super.getPreco() + taxaAlfandega;
    }

    @Override
    public String etiquetaPreco() {
        return getNome() + " - R$" + String.format("%.2f", getPreco()) + " (Taxa Alfândega: R$" + String.format("%.2f", taxaAlfandega) + ")";
    }
}
