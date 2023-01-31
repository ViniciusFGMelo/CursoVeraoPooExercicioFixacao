package br.ufjf.dcc.poo.model;

public class Caminhao extends Veiculo {

	private double tara;
	
	public Caminhao(String marca, double capacidadeTanque, double kmRodados, double tara) {
		super(marca, capacidadeTanque, kmRodados);
		// TODO Auto-generated constructor stub
		this.tara = tara;
	}

	@Override
	public double calcularConsumo() {
		// TODO Auto-generated method stub
		return super.calcularConsumo()/tara;
	}

	public double getTara() {
		return tara;
	}
}
