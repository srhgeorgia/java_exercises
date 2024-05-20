package exerciciosClasses;

public class Pessoa {

	String nome;
	int idade;
	String genero;
	
	public Pessoa(String nome, int idade, String genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome= " + nome + ", idade= " + idade + ", genero= " + genero + "]";
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
}
