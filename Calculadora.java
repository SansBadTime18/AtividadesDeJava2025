package br.com.exemplo.matematica;

public class Calculadora implements OperacaoMatematica {
    @Override
    public double soma(double a, double b) {
        return a + b;
    }

    @Override
    public double subtracao(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicacao(double a, double b) {
        return a * b;
    }

    @Override
    public double divisao(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Divisão por zero não permitida!");
        return a / b;
    }
}
