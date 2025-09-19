package br.edu.fatecpg.tecprog.atividade01.model;

public class Videolocadora {
    private String[] filmes;
    private int[] vezesAlugado;
    private double[] precosLocacao;
    private int qtd;

    public Videolocadora(int qtd) {
        this.qtd = qtd;
        filmes = new String[qtd];
        vezesAlugado = new int[qtd];
        precosLocacao = new double[qtd];
    }

    // Cadastrar um filme
    public void setFilme(int i, String nome, double preco) {
        filmes[i-1] = nome;
        precosLocacao[i-1] = preco;
        vezesAlugado[i-1] = 0; // inicia com 0 vezes alugado
    }

    // Listar todos os filmes
    public void listarFilmes() {
        for (int c = 0; c < qtd; c++) {
            System.out.println(
                "Filme: " + filmes[c] + "\n" +
                "Preço da Locação: R$ " + precosLocacao[c] + "\n" +
                "Vezes alugado: " + vezesAlugado[c] + "\n"
            );
        }
    }

    // Faturamento se todos fossem alugados uma vez
    public double faturamentoEsperado() {
        double total = 0;
        for (int c = 0; c < qtd; c++) {
            total += precosLocacao[c];
        }
        return total;
    }

    // Descobrir filme mais alugado
    public String filmeMaisAlugado() {
        int max = -1;
        String filme = "";
        for (int c = 0; c < qtd; c++) {
            if (vezesAlugado[c] > max) {
                max = vezesAlugado[c];
                filme = filmes[c];
            }
        }
        return "Filme mais alugado: " + filme + " (" + max + " vezes)";
    }

    // Alugar um filme
    public String alugarFilme(int i) {
        vezesAlugado[i-1]++;
        return "Você alugou o filme: " + filmes[i-1];
    }

    // Devolver um filme
    public String devolverFilme(int i) {
        return "Você devolveu o filme: " + filmes[i-1];
    }
}
