package br.edu.fatecpg.tipoC;
public class Celular {
    public String marca;
    public String modelo;
    public double preco;
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.marca = "Samsung";
        c1.modelo = "Galaxy S24";
        c1.preco = 4500.00;
        System.out.println("Marca: " + c1.marca);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Preço: R$" + c1.preco);
    }
}