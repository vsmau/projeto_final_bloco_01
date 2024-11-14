package loja.repository;

import loja.model.Livro;

public interface LivroRepository {

	// Crud dos livros
	
	public void listarTodos();
	public void vender(int id);
	public void cadastrar(Livro livro);
}
