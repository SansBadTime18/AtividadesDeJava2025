package br.edu.fatecpg.tecpprog.estruturada.view;

import br.edu.fatecpg.tecpprog.estruturada.model.Carro;
import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        Carro carro = new Carro();
        
        System.out.println("Digite a cor do carro: ");
        carro.setCor(sc.nextLine());
        
        System.out.println("Digite o modelo do carro: ");
        carro.setModelo(sc.nextLine());
        
        System.out.println("Digite a capacidade de tanque (em litros): ");
        carro.setCapacidadeTanque(sc.nextDouble());
        
        System.out.println("Digite o valor do litro da gasolina: ");
        double valorLitro = sc.nextDouble();
        
        double custoTotal = carro.calcularCustoEncherTanque(valorLitro);
        System.out.printf("Custo para encher o tanque: R$ %.2f%n", custoTotal);
        
        carro.desligar();
        carro.ligar();
        carro.acelerar();
        carro.buzinar();
        carro.frear();
        
        sc.close();
    }
}
