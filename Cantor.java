package br.edu.fatecpg.tecpprog.estruturada.model;

// ===================== CLASSE CANTOR =====================
public class Cantor {
    public String nome;
    public int idade;
    public String generoMusical;
    public int lancamentos;
    public int premios;
    public boolean cantando = false;

    public void cantar() {
        if(cantando) {
            System.out.println(nome + " está cantando sua música.");
        } else {
            System.out.println(nome + " não está cantando no momento.");
        }
    }

    public void compor() {
        if(cantando) {
            System.out.println(nome + " está compondo uma nova música.");
        } else {
            System.out.println(nome + " não está inspirado para compor agora.");
        }
    }

    public void ensaiar() {
        if(cantando) {
            System.out.println(nome + " está ensaiando para o show.");
        } else {
            System.out.println(nome + " ainda não iniciou os ensaios.");
        }
    }
}
