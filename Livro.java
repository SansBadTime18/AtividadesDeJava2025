package br.edu.fatecpg.tipoB;
public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.anoPublicacao = 1899;
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Ano: " + livro1.anoPublicacao);
    }
}