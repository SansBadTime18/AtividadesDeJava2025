package br.edu.fatecpg.tipoC;
import java.util.Arrays;
public class PostoCombustivel {
    String[] tiposCombustivel = {"Gasolina", "Etanol", "Diesel"};
    double[] precosLitro = {6.50, 4.20, 5.50};
    int[] litrosDisponiveis = {500, 300, 800};
    public void exibirCombustiveis() {
        System.out.println("=== Combustíveis Disponíveis ===");
        for (int i = 0; i < tiposCombustivel.length; i++) {
            System.out.println(tiposCombustivel[i] + " - R$" + precosLitro[i] + "/L - " + litrosDisponiveis[i] + "L disponíveis");
        }
    }
    public double valorTotalEstoque() {
        double total = 0;
        for (int i = 0; i < tiposCombustivel.length; i++) {
            total += precosLitro[i] * litrosDisponiveis[i];
        }
        return total;
    }
    public void maiorEMenorEstoque() {
        int maior = 0, menor = 0;
        for (int i = 1; i < litrosDisponiveis.length; i++) {
            if (litrosDisponiveis[i] > litrosDisponiveis[maior]) maior = i;
            if (litrosDisponiveis[i] < litrosDisponiveis[menor]) menor = i;
        }
        System.out.println("Maior estoque: " + tiposCombustivel[maior]);
        System.out.println("Menor estoque: " + tiposCombustivel[menor]);
    }
    public void venderCombustivel(String tipo, int litros) {
        int index = Arrays.asList(tiposCombustivel).indexOf(tipo);
        if (index != -1 && litrosDisponiveis[index] >= litros) {
            litrosDisponiveis[index] -= litros;
            System.out.println("Venda realizada: " + litros + "L de " + tipo);
        } else {
            System.out.println("Venda não realizada. Estoque insuficiente ou combustível inexistente.");
        }
    }
    public void reabastecer(String tipo, int litros) {
        int index = Arrays.asList(tiposCombustivel).indexOf(tipo);
        if (index != -1) {
            litrosDisponiveis[index] += litros;
            System.out.println("Reabastecido " + litros + "L de " + tipo);
        }
    }
    public static void main(String[] args) {
        PostoCombustivel p = new PostoCombustivel();
        p.exibirCombustiveis();
        System.out.println("\nValor total em estoque: R$" + p.valorTotalEstoque());
        p.maiorEMenorEstoque();
        p.venderCombustivel("Etanol", 100);
        p.reabastecer("Gasolina", 200);
        p.exibirCombustiveis();
    }
}