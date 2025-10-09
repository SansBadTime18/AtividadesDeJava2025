package br.edu.fatecpg.tipoA;
import java.util.ArrayList;
import java.util.Arrays;

public class Farmacia {
    String[] nomesMedicamentos = {"Paracetamol", "Amoxicilina", "Ibuprofeno", "Dipirona"};
    int[] diasParaVencimento = {10, 3, 6, 2};
    double[] precos = {12.0, 25.5, 18.0, 10.0};
    public void mostrarMedicamentos() {
        System.out.println("=== Lista de Medicamentos ===");
        for (int i = 0; i < nomesMedicamentos.length; i++) {
            System.out.println(nomesMedicamentos[i] + " - R$" + precos[i] + " - " + diasParaVencimento[i] + " dias p/ vencer");
        }
    }
    public double mediaDiasVencimento() {
        int soma = 0;
        for (int dias : diasParaVencimento) soma += dias;
        return (double) soma / diasParaVencimento.length;
    }
    public void aplicarDescontos() {
        for (int i = 0; i < nomesMedicamentos.length; i++) {
            if (diasParaVencimento[i] < 5) {
                precos[i] *= 0.5;
            }
        }
    }
    public void venderMedicamento(String nome) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList(nomesMedicamentos));
        int index = nomes.indexOf(nome);
        if (index != -1) {
            nomes.remove(index);
            System.out.println("Medicamento vendido: " + nome);
        } else {
            System.out.println("Medicamento não encontrado.");
        }
    }
    public static void main(String[] args) {
        Farmacia f = new Farmacia();
        f.mostrarMedicamentos();
        System.out.println("\nMédia de dias p/ vencimento: " + f.mediaDiasVencimento());
        f.aplicarDescontos();
        System.out.println("\nApós aplicar descontos:");
        f.mostrarMedicamentos();
        f.venderMedicamento("Dipirona");
    }
}