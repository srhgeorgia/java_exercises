package exerciciosClasses;

public class Carro {
	
	private String marca;
	private String modelo;
	private int ano;
	private double quilometragem;
	private boolean ligado;
	private int velocidade;

	public Carro(String marca, String modelo, int ano, double quilometragem) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.quilometragem = quilometragem;
		this.ligado = false; 
		this.velocidade = 0; 
	}

	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("O carro foi ligado.");
		} else {
			System.out.println("O carro já está ligado.");
		}
	}

	public void acelerar(int incrementoVelocidade) {
		if (ligado) {
			velocidade += incrementoVelocidade;
			System.out.println("O carro acelerou para " + velocidade + " km/h.");
		} else {
			System.out.println("O carro precisa estar ligado para acelerar.");
		}
	}

	public void frear(int decrementoVelocidade) {
		if (ligado) {
			if (velocidade >= decrementoVelocidade) {
				velocidade -= decrementoVelocidade;
				System.out.println("O carro reduziu a velocidade para " + velocidade + " km/h.");
			} else {
				System.out.println("O carro já está parado.");
				velocidade = 0;
			}
		} else {
			System.out.println("O carro precisa estar ligado para frear.");
		}
	}

	public void exibirInformacoes() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Quilometragem: " + quilometragem + " km");
		System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
		System.out.println("Velocidade: " + velocidade + " km/h");
	}
}
