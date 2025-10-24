package br.com.exemplo.seguranca;

import java.util.Scanner;

public class TesteSistemaDeSeguranca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaDeSeguranca sistema = new SistemaDeSeguranca();

        while (!sistema.isAutenticado()) {
            System.out.print("Usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            sistema.login(usuario, senha);
        }

        System.out.println("Bem-vindo ao sistema, admin!");
        System.out.print("Deseja fazer logout? (s/n): ");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("s")) {
            sistema.logout();
        }

        sc.close();
    }
}
