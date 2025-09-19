package br.edu.fatecpg.tecprog.atividade01.view;
import br.edu.fatecpg.tecprog.atividade01.model.*;

public class BibliotecaMain {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca(3);

        bib.setLivro(1, "Dom Casmurro", 1.50);
        bib.setLivro(2, "O Senhor dos Anéis", 2.00);
        bib.setLivro(3, "1984", 1.00);

        bib.mostrarLivros();

        System.out.println(bib.emprestarLivro(2));
        System.out.println(bib.devolverLivro(2, 3));

        bib.mostrarLivros();
        System.out.println("Multa total acumulada: R$ " + bib.multaTotal());
        System.out.println("Média dias de atraso: " + bib.mediaDiasAtraso());
    }
}
