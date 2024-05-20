package exerciciosClasses;

public class principalCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 50000.0);

		meuCarro.ligar();
		meuCarro.acelerar(50);
		meuCarro.frear(20);
		meuCarro.exibirInformacoes();
	}

}
