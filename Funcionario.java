package br.edu.fatecpg.tipoB;
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("João");
        f.setSalario(3500);
        f.setCargo("Analista");
        System.out.println("Funcionário: " + f.getNome());
        System.out.println("Cargo: " + f.getCargo());
        System.out.println("Salário: R$" + f.getSalario());
    }
}