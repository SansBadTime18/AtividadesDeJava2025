package br.edu.fatecpg.tecpprog.estruturada.model;
 
public class Carro {
	public String cor;
	public String modelo;
	public double CapacidadeTanque;
	public boolean ligado = false;
	public void ligar() {
		if(ligado) {
			System.out.println("O carro está ligado");
		}else {
			System.out.println("Ligando o carro");
			ligado = true;
		}
	}
	public void acelerar() {
		if(ligado) {
			System.out.println("Acelerando...");
		}else {
			System.out.println("O carro está desligado");
		}
	}
	public void frear() {
		if(ligado) {
			System.out.println("Freando...");
		}else {
			System.out.println("O carro está desligado");
		}
	}
	public void buzinar() {
		if(ligado) {
			System.out.println("BI BI BI BI");
		}else {
			System.out.println("O carro está desligado");
		}
	}
	public void desligar() {
		if(ligado) {
			System.out.println("Desligando...");
			ligado = false;
		}else {
			System.out.println("O carro já está desligado");
		}
	}
}