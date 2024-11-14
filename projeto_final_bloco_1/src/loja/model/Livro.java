package loja.model;

public abstract class Livro {
	private int id;
	private String nome;
	private String autor;
	private float preco;
	private int tipo;

	public Livro(int id, String nome, String autor, float preco, int tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void visualizar() {
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Livro físico";
			break;
		case 2: 
			tipo = "Livro digital";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Livro:");
		System.out.println("***********************************************************");
		System.out.println("ID do Livro: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Autor: " + this.autor);
		System.out.println("Preço: " + this.preco);
		System.out.println("Tipo: " + tipo);
	}
	
}
