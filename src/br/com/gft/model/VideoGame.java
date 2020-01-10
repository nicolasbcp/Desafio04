package br.com.gft.model;

public class VideoGame extends Produto {
	// Atributos
	private String marca, modelo;
	private boolean isUsado;
	
	// Métodos Construtores
	public VideoGame() {
		
	}
	
	// Métodos Especiais
	public VideoGame(String marca, String modelo, boolean isUsado) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setUsado(isUsado);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto() {
		if (this.isUsado() == true) {
			System.out.println("O imposto cobrado sob este produto é de R$ " + getPreco() * 0.25);
		} else {
			System.out.println("O imposto cobrado sob este produto é de R$ " + getPreco() * 0.45);
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Video-game: " + this.getNome() + ", R$ " + this.getPreco() + ", " + this.getQtd() + " unidades em estoque.";
	}
}
