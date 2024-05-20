package exerciciosClasses;

import java.util.ArrayList;

//Classe para o sistema de gerenciamento de livros
public class GerenciamentoLivro {
	private ArrayList<Livro> livros;

	public GerenciamentoLivro() {
     this.livros = new ArrayList<>();
 }

	public void adicionarLivro(String titulo, String autor) {
		Livro livro = new Livro(titulo, autor);
		livros.add(livro);
		System.out.println("Livro adicionado com sucesso!");
	}

	public void buscarLivro(String titulo) {
		boolean encontrado = false;
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println("Livro encontrado:");
				System.out.println("Título: " + livro.getTitulo());
				System.out.println("Autor: " + livro.getAutor());
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Livro não encontrado.");
		}
	}

	public void listarLivros() {
		if (livros.isEmpty()) {
			System.out.println("A biblioteca está vazia.");
		} else {
			System.out.println("Lista de livros na biblioteca:");
			for (Livro livro : livros) {
				System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
			}
		}
	}
}
