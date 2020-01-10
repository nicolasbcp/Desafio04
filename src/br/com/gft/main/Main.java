package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

public class Main {
	public static void main(String[] args) {
		Livro l1 = new Livro();
		l1.setNome("Harry Potter");
		l1.setPreco(40.00);
		l1.setQtd(50);
		Livro l2 = new Livro();
		l2.setNome("Senhor dos Anéis");
		l2.setPreco(60.00);
		l2.setQtd(30);
		Livro l3 = new Livro();
		l3.setNome("Java POO");
		l3.setPreco(20.00);
		l3.setQtd(50);
		
		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		VideoGame ps4 = new VideoGame();
		ps4.setMarca("Sony");
		ps4.setModelo("Slim");
		ps4.setUsado(false);
		ps4.setPreco(1800.00);
		ps4.setQtd(100);
		ps4.setNome("PS4");
		VideoGame ps4Usado = new VideoGame();
		ps4Usado.setMarca("Sony");
		ps4Usado.setModelo("Slim");
		ps4Usado.setUsado(true);
		ps4Usado.setPreco(1000.00);
		ps4Usado.setQtd(7);
		ps4Usado.setNome("PS4");
		VideoGame xbox = new VideoGame();
		xbox.setMarca("Microsoft");
		xbox.setModelo("X box One");
		xbox.setUsado(false);
		xbox.setPreco(1500.00);
		xbox.setQtd(500);
		xbox.setNome("X-Box");
		
		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		
		Loja americanas = new Loja("Americanas", "12345678", livros, games);
		
		l2.calculaImposto();
		l3.calculaImposto();
		System.out.println("-----------------------------------------------------");
		ps4Usado.calculaImposto();
		xbox.calculaImposto();
		System.out.println("-----------------------------------------------------");
		int n;
		int b = livros.size();
		for (n = 0; n < b; n++) {
			System.out.println(livros.get(n));
		}
		System.out.println("-----------------------------------------------------");
		
		int p;
		int c = games.size();
		for (p = 0; p < c; p++) {
			System.out.println(games.get(p));
		}
		System.out.println("-----------------------------------------------------");
		
		new Loja().calculaPatrimonio(games, livros);
	}
}
