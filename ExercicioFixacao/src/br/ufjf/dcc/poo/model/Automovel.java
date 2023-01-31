package br.ufjf.dcc.poo.model;

public class Automovel extends Veiculo{
	
	private double precoLitro;

	public Automovel(String marca, double capacidadeTanque, double kmRodados, double precoLitro) {
		super(marca, capacidadeTanque, kmRodados);
		// TODO Auto-generated constructor stub
		this.precoLitro = precoLitro;
	}

	@Override
	public double calcularConsumo() {
		// TODO Auto-generated method stub
		return super.calcularConsumo()*precoLitro;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}
}
