package br.edu.fatecpg.tecpprog.estruturada.model; 
// ===================== CLASSE ENGENHEIRO =====================
public class Engenheiro {
    public String nome;
    public int idade;
    public String crea;
    public String especializacao;
    public int experiencia;
    public boolean trabalhando = false;

    public void projetar() {
        if(trabalhando) {
            System.out.println(nome + " está projetando...");
        } else {
            System.out.println(nome + " não pode projetar, pois não está trabalhando.");
        }
    }

    public void supervisionar() {
        if(trabalhando) {
            System.out.println(nome + " está supervisionando a obra.");
        } else {
            System.out.println(nome + " não pode supervisionar agora.");
        }
    }

    public void planejar() {
        if(trabalhando) {
            System.out.println(nome + " está planejando uma nova construção.");
        } else {
            System.out.println(nome + " não está em horário de trabalho.");
        }
    } 
}
