package br.edu.fatecpg.tipoB;

import java.util.Arrays;

public class Supermercado {
    String[] nomesProdutos = {"Arroz", "Feijão", "Macarrão", "Açúcar"};
    double[] precos = {20.0, 10.0, 8.0, 5.0};
    double[] descontos = {0.1, 0.05, 0.2, 0.15};
    public void listarProdutos() {
        System.out.println("=== Lista de Produtos ===");
        for (int i = 0; i < nomesProdutos.length; i++) {
            double precoFinal = precos[i] * (1 - descontos[i]);
            System.out.println(nomesProdutos[i] + " - Original: R$" + precos[i] + " | Com desconto: R$" + precoFinal);
        }
    }
    public double totalCompra() {
        double total = 0;
        for (int i = 0; i < precos.length; i++) {
            total += precos[i] * (1 - descontos[i]);
        }
        return total;
    }
    public String maiorEconomia() {
        double maior = 0;
        String produto = "";
        for (int i = 0; i < nomesProdutos.length; i++) {
            double economia = precos[i] * descontos[i];
            if (economia > maior) {
                maior = economia;
                produto = nomesProdutos[i];
            }
        }
        return produto;
    }
    public void comprarProduto(String nome) {
        int index = Arrays.asList(nomesProdutos).indexOf(nome);
        if (index != -1) {
            System.out.println("Produto comprado: " + nome);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    public static void main(String[] args) {
        Supermercado s = new Supermercado();
        s.listarProdutos();
        System.out.println("\nTotal da compra: R$" + s.totalCompra());
        System.out.println("Maior economia em: " + s.maiorEconomia());
        s.comprarProduto("Feijão");
    }
}