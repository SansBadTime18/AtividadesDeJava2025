package br.edu.fatecpg.tecpprog.estruturada.model;

// ===================== CLASSE ATOR =====================
public class Ator {
    public String nome1;
    public int idade;
    public int experiencia; // em anos
    public String drt;
    public String especialidade;
    public boolean atuando = false;
	public String nome;

    public void atuar() {
        if(atuando) {
            System.out.println(nome1 + " está atuando em cena!");
        } else {
            System.out.println(nome1 + " ainda não começou a atuar.");
        }
    }

    public void ensaiar() {
        if(atuando) {
            System.out.println(nome1 + " está ensaiando para a próxima cena.");
        } else {
            System.out.println(nome1 + " não está no ensaio.");
        }
    }

    public void estudoDeRoteiro() {
        if(atuando) {
            System.out.println(nome1 + " está estudando o roteiro intensamente.");
        } else {
            System.out.println(nome1 + " precisa iniciar o estudo do roteiro.");
        }
    }
}
