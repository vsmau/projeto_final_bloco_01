package loja.model;

public class LivroFisico extends Livro{
	
	private int capa;

	public LivroFisico(int id, String nome, String autor, float preco, int tipo, int capa) {
		super(id, nome, autor, preco, tipo);
		this.capa = capa;
		
	}

	public int getCapa() {
		return capa;
	}

	public void setCapa(int capa) {
		this.capa = capa;
	}
	
	public void visualizar() {
		super.visualizar();
		String capa = "";
		switch(this.capa) {
		case 1:
			capa = "Não";
			break;
		case 2: 
			capa = "Sim";
			break;
		}
		System.out.println("Capa dura: " + capa);
	}

}
