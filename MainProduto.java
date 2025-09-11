package br.edu.fatecpg.tecpprog.estruturada.view;

import br.edu.fatecpg.tecpprog.estruturada.model.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setNome("Notebook");
        p1.setPreco(3500.00);
        p1.setQuantidadeEstoque(10);

        p1.exibirInfo();

        System.out.println("\n--- Testando restrições ---");

        p1.setPreco(-1500);
        p1.setQuantidadeEstoque(-5);

        p1.exibirInfo();
    }
}
