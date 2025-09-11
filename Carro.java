package br.edu.fatecpg.tecpprog.estruturada.model;
 
public class Carro {
	public String cor;
	public String modelo;
	public double capacidadeTanque;
	public boolean ligado = false;
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}
	
	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public double calcularCustoEncherTanque(double valorLitro) {
		return capacidadeTanque * valorLitro;
	}
	
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
			System.out.println("Buzinando");
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