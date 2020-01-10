package br.com.gft.model;

public class Livro extends Produto {
	// Atributos
	private String autor, tema;
	private int qtdPag;
	
	// M�todos Construtores
	public Livro() {
		
	}
	
	// M�todos Especiais
	public Livro(String autor, int i, int j, String tema, String string, int qtdPag) {
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {
		if (this.getTema() == "educativo") {
			System.out.println("O imposto sob livros educativos � R$ " + 0);
		} else {
			System.out.println("O imposto sob este livro � igual a R$ " + getPreco() * 0.10);
		}
		return 0;
	}

	@Override
	public String toString() {
		return "T�tulo: " + this.getNome() + ", R$ " + this.getPreco() + ", " + this.getQtd() + " unidades em estoque.";
	}
	


	
}
