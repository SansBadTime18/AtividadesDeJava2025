package br.edu.fatecpg.tecprog.atividade01.view;
import br.edu.fatecpg.tecprog.atividade01.model.*;

public class VideolocadoraMain {
    public static void main(String[] args) {
        Videolocadora locadora = new Videolocadora(3);

        locadora.setFilme(1, "Matrix", 7.5);
        locadora.setFilme(2, "O Senhor dos Anéis", 10.0);
        locadora.setFilme(3, "Vingadores", 12.0);

        locadora.listarFilmes();
        System.out.println("Faturamento esperado: R$ " + locadora.faturamentoEsperado());

        System.out.println(locadora.alugarFilme(2));
        System.out.println(locadora.alugarFilme(2));
        System.out.println(locadora.alugarFilme(3));

        System.out.println(locadora.filmeMaisAlugado());
        System.out.println(locadora.devolverFilme(2));
    }
}
