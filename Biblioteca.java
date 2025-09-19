package br.edu.fatecpg.tecprog.atividade01.model;

public class Biblioteca {
    private String[] livros;
    private int[] diasAtraso;
    private double[] multaPorDia;
    private boolean[] disponiveis; // controle de empréstimos

    private int qtd;

    public Biblioteca(int qtd) {
        this.qtd = qtd;
        livros = new String[qtd];
        diasAtraso = new int[qtd];
        multaPorDia = new double[qtd];
        disponiveis = new boolean[qtd];

        for (int i = 0; i < qtd; i++) {
            disponiveis[i] = true; // todos começam disponíveis
        }
    }

    // Cadastrar um livro na biblioteca
    public void setLivro(int i, String nome, double multa) {
        livros[i - 1] = nome;
        multaPorDia[i - 1] = multa;
        diasAtraso[i - 1] = 0;
    }

    // Mostrar todos os livros com dados
    public void mostrarLivros() {
        for (int i = 0; i < qtd; i++) {
            System.out.println(
                "Livro: " + livros[i] + "\n" +
                "Dias de atraso: " + diasAtraso[i] + "\n" +
                "Multa por dia: R$ " + multaPorDia[i] + "\n" +
                "Disponível: " + (disponiveis[i] ? "Sim" : "Não") + "\n"
            );
        }
    }

    // Calcular a multa total acumulada
    public double multaTotal() {
        double total = 0;
        for (int i = 0; i < qtd; i++) {
            total += diasAtraso[i] * multaPorDia[i];
        }
        return total;
    }

    // Média de dias de atraso dos livros devolvidos
    public double mediaDiasAtraso() {
        int soma = 0;
        int contador = 0;
        for (int i = 0; i < qtd; i++) {
            if (diasAtraso[i] > 0) {
                soma += diasAtraso[i];
                contador++;
            }
        }
        if (contador == 0) return 0;
        return (double) soma / contador;
    }

    // Emprestar livro
    public String emprestarLivro(int i) {
        if (disponiveis[i - 1]) {
            disponiveis[i - 1] = false;
            return "Você emprestou o livro: " + livros[i - 1];
        } else {
            return "Livro já está emprestado!";
        }
    }

    // Devolver livro
    public String devolverLivro(int i, int atraso) {
        disponiveis[i - 1] = true;
        diasAtraso[i - 1] = atraso;
        if (atraso > 0) {
            return "Livro devolvido com atraso de " + atraso + " dias. Multa: R$ " + (atraso * multaPorDia[i - 1]);
        } else {
            return "Livro devolvido no prazo. Sem multa.";
        }
    }
}
