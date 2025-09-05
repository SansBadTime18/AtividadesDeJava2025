package br.edu.fatecpg.tecpprog.estruturada.view;

import br.edu.fatecpg.tecpprog.estruturada.model.Ator;
import br.edu.fatecpg.tecpprog.estruturada.model.Cantor;
import br.edu.fatecpg.tecpprog.estruturada.model.Engenheiro;

public class Main {
    public static void main(String[] args) {
        
        // ===================== ENGENHEIRO =====================
        Engenheiro eng1 = new Engenheiro();
        eng1.nome = "Carlos";
        eng1.idade = 40;
        eng1.crea = "12345-SP";
        eng1.especializacao = "Civil";
        eng1.experiencia = 15;
        eng1.trabalhando = true;

        Engenheiro eng2 = new Engenheiro();
        eng2.nome = "Marina";
        eng2.idade = 35;
        eng2.crea = "54321-SP";
        eng2.especializacao = "Elétrica";
        eng2.experiencia = 12;
        eng2.trabalhando = false;

        System.out.println("Engenheiro: " + eng1.nome);
        eng1.projetar();
        System.out.println("Engenheiro: " + eng2.nome);
        eng2.supervisionar();

        // ===================== ATOR =====================
        Ator ator1 = new Ator();
        ator1.nome = "João";
        ator1.idade = 28;
        ator1.experiencia = 5;
        ator1.drt = "DRT123";
        ator1.especialidade = "Comédia";
        ator1.atuando = true;

        Ator ator2 = new Ator();
        ator2.nome = "Clara";
        ator2.idade = 32;
        ator2.experiencia = 8;
        ator2.drt = "DRT456";
        ator2.especialidade = "Drama";
        ator2.atuando = false;

        System.out.println("Ator: " + ator1.nome);
        ator1.atuar();
        System.out.println("Ator: " + ator2.nome);
        ator2.estudoDeRoteiro();

        // ===================== CANTOR =====================
        Cantor cantor1 = new Cantor();
        cantor1.nome = "Lucas";
        cantor1.idade = 25;
        cantor1.generoMusical = "Pop";
        cantor1.lancamentos = 3;
        cantor1.premios = 2;
        cantor1.cantando = true;

        Cantor cantor2 = new Cantor();
        cantor2.nome = "Fernanda";
        cantor2.idade = 29;
        cantor2.generoMusical = "Sertanejo";
        cantor2.lancamentos = 5;
        cantor2.premios = 1;
        cantor2.cantando = false;

        System.out.println("Cantor: " + cantor1.nome);
        cantor1.cantar();
        System.out.println("Cantora: " + cantor2.nome);
        cantor2.ensaiar();
    }
}
