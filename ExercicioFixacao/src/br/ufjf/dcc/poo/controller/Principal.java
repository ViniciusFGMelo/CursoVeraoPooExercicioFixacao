package br.ufjf.dcc.poo.controller;

import br.ufjf.dcc.poo.model.Caminhao;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caminhao caminhao = new Caminhao("Volvo", 100, 15, 1500);
		System.out.println(caminhao.calcularConsumo());
	}

}
