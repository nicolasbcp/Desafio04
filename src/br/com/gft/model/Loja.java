package br.com.gft.model;

import java.util.List;

public class Loja {
	// Atributos
	private String nome, cnpj;
	private List<?> livros, videoGames;
	
	// Construtores
	public Loja() {
		
	}

	public Loja(String nome, String cnpj, List<?> livros, List<?> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}
	
	// Métodos Especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<?> getLivros() {
		return livros;
	}

	public void setLivros(List<?> livros) {
		this.livros = livros;
	}

	public List<?> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<?> videoGames) {
		this.videoGames = videoGames;
	}
	
	// Métodos Personalizados
	public void listaLivros() {
		if (this.getLivros().isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		} else {
			System.out.println("Segue listagem de livros:\n " + this.getLivros());
		}
	}
	
	public void listaVideoGames() {
		if (this.getVideoGames().isEmpty()) {
			System.out.println("A loja não tem Video-Games no seu estoque.");
		} else {
			System.out.println("Segue listagem de Video-Games:\n " + this.getVideoGames());
		}
	}
	
	public void calculaPatrimonio(List<VideoGame> games, List<Livro> livros) {
		int p;
		double patrimonio = 0;
		int c = games.size();
		for (p = 0; p < c; p++) {
			patrimonio = patrimonio + (games.get(p).getPreco() * games.get(p).getQtd()) + (livros.get(p).getPreco() * livros.get(p).getQtd());
		}
		System.out.println("O patrimônio total da loja é igual a R$ " + patrimonio);
	}
} 
