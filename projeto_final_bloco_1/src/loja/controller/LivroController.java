package loja.controller;

import java.util.ArrayList;

import loja.model.Livro;

import loja.repository.LivroRepository;

public class LivroController implements LivroRepository {

	private ArrayList<Livro> listaLivros = new ArrayList<Livro>();
	int numero = 0;

	@Override
	public void listarTodos() {
		for (var livro : listaLivros) {
			livro.visualizar();
		}

	}

	@Override
	public void cadastrar(Livro livro) {
		listaLivros.add(livro);
		System.out.println("\nO livro número: " + livro.getId() + " foi criada com sucesso");
	}

	@Override
	public void vender(int numero) {
		var livro = buscarNaCollection(numero);
		
		if(livro != null) {
			if(listaLivros.remove(livro) == true)
				System.out.println("\nO livro de ID: " + numero + " foi deletada com sucesso!");
		} else {
			System.out.println("\nO livro numero de ID: " + numero + " não foi encontrada!");
		}

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Livro buscarNaCollection(int numero) {
		for (var livro : listaLivros) {
			if (livro.getId() == numero) {
				return livro;
			}
		}
		return null;
	}

}
