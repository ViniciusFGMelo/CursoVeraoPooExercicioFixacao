package br.ufjf.dcc.poo.model;

public abstract class Veiculo {
	
	private String marca;
	private double capacidadeTanque;
	private double kmRodados;
	
	public Veiculo(String marca, double capacidadeTanque, double kmRodados) {
		super();
		this.marca = marca;
		this.capacidadeTanque = capacidadeTanque;
		this.kmRodados = kmRodados;
	}

	public double calcularConsumo () {
		return (capacidadeTanque/kmRodados);
	}
	
}
