package loja.model;

public class LivroDigital extends Livro {

	private float tamanho;
	
	public LivroDigital(int id, String nome, String autor, float preco, int tipo, float tamanho) {
		super(id, nome, autor, preco, tipo);
		this.tamanho = tamanho;
		
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Tamanho em MB: " + this.tamanho);
	}

}
