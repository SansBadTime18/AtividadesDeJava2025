package br.edu.fatecpg.tecpprog.estruturada.view;

import br.edu.fatecpg.tecpprog.estruturada.model.ContaBancaria;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João");
        ContaBancaria conta2 = new ContaBancaria("Maria");

        conta1.depositar(500);
        conta1.sacar(200);
        conta1.sacar(400);

        System.out.println("Saldo final de " + conta1.getTitular() + ": R$ " + conta1.getSaldo());

        conta2.depositar(1000);
        conta2.sacar(300);
        System.out.println("Saldo final de " + conta2.getTitular() + ": R$ " + conta2.getSaldo());
    }
}
