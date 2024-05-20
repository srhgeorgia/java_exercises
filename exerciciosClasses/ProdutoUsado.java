package exerciciosClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	private Date dataFabricacao;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ProdutoUsado(String nome, double preco, String dataFabricacao) throws ParseException {
		super(nome, preco);
		this.dataFabricacao = sdf.parse(dataFabricacao);
	}

	@Override
	public String etiquetaPreco() {
		return getNome() + " (usado) - R$" + String.format("%.2f", getPreco()) + " (Fabricação: "
				+ sdf.format(dataFabricacao) + ")";
	}
}
