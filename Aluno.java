package br.edu.fatecpg.tipoA;
public class Aluno {
    private String nome;
    private int matricula;
    private double notaFinal;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Lucas");
        a1.setMatricula(1234);
        a1.setNotaFinal(8.7);
        System.out.println("Aluno: " + a1.getNome());
        System.out.println("Matrícula: " + a1.getMatricula());
        System.out.println("Nota Final: " + a1.getNotaFinal());
    }
}